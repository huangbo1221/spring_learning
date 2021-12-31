# IOC思想
先用一个简单的实例来讲一下IOC（控制反转）的思想，如下：
先实现一个UserDao、UserDaoImpl。
再在业务层实现一个UserService和UserServiceImpl。
注意UserServiceImpl的实现如下：
```java
private UserDao userDao = new UserDaoImpl();

@Override
public void getUsers() {
    userDao.getUsers();
}
```
直接由业务自己在私有成员上初始化了一个dao层的实现类实例，这种方式
极为笨拙！

然后在模拟一个用户MyTest，如下：
```java
public class MyTest01 {

    // 相当于一个真实的用户
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.getUsers();
    }
}
```
输出如下：
```shell
use UserDaoImpl!
```
由输出结果可知，也能达到调dao层的目的。

但是，如果此时用户想用mybatis来取代自己的数据库，业务仍要能够调到
dao层，应该怎么做呢？
首先应该实现一个UserMybatisImpl实现类。
那业务层还得继续适配修改，如下：
```java
private UserDao userDao = new UserMybatisImpl();

@Override
public void getUsers() {
    userDao.getUsers();
}
```
如上，业务得修改成员变量的初始化dao层实现对象！！！
输出如下：
```shell
use UserMybatisImpl!
```
在修改了业务层代码后达到了效果！

若用户又切到sqlserver呢？？
同样，在dao层实现一个UserSqlServerImpl类。然后业务层又得继续修改：
```java
private UserDao userDao = new UserSqlServerImpl();

@Override
public void getUsers() {
    userDao.getUsers();
}
```
输出如下：
```shell
use UserSqlServerImpl!
```

如上，用户需求的变动得反复修改业务层，若代码量很庞大，则费时费力。
这样的设计肯定会相当差！

有一种方式可以去解决这种问题，不直接初始化业务层的成员变量，而是采用
动态set的方式，如下：
```java
private UserDao userDao;

public void setUserDao(UserDao userDao) {
    this.userDao = userDao;
}

@Override
public void getUsers() {
    userDao.getUsers();
}
```

这种情况下，用户调用时，应该以如下方式：
```java
public class MyTest01 {

    // 相当于一个真实的用户
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        // 这里无法执行userService.setUserDao方法，是因为多态无法利用父类调用子类特有的方法！
        // 得强转成UserServiceImpl
        ((UserServiceImpl)userService).setUserDao(new UserSqlServerImpl());
        userService.getUsers();
    }
}
```
输出如下：
```shell
use UserSqlServerImpl!
```

此时，用户再想切oracle时，实现一个UserOracleDaoimpl即可。
不用再修改业务层！！
用户调用时，主动指定什么类型的数据库即可。如下：
```java
public class MyTest01 {

    // 相当于一个真实的用户
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        // 这里无法执行userService.setUserDao方法，是因为多态无法利用父类调用子类特有的方法！
        // 得强转成UserServiceImpl
        ((UserServiceImpl)userService).setUserDao(new UserOracleDaoimpl());
        userService.getUsers();
    }
}
```
输出如下：
```shell
use UserOracleDaoimpl!
```

上面的变化其实就是一种IOC的原型，将控制权由业务层交给了用户，给
用户自己去选择！