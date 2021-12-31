import com.huang.ioc01.UserDao.UserOracleDaoimpl;
import com.huang.ioc01.UserDao.UserSqlServerImpl;
import com.huang.ioc01.UserService.UserService;
import com.huang.ioc01.UserService.UserServiceImpl;

/**
 * @ClassName MyTest01
 * @Description TODO
 * @Author huangbo1221
 * @Date 2021/12/31 22:58
 * @Version 1.0
 */
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
