# SpringMVC
## 第一个MVC程序
参见springmvc-02-hellomvc

可能出现的报错如下：

![img.png](img.png)

应用程序打包发布时必须包含所必须的lib库，可以查看打出的war包是否包含lib，如下：

![img_1.png](img_1.png)

如缺少，可以采用如下方式添加：

![img_2.png](img_2.png)

实例如下：
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!--  根据bean的name来进行url的转发处理，如下面name="/hello"的处理方式  -->
    <bean class="org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping"/>
    <bean class="org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter"/>

    <bean id="InternalResourceViewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <!--   前缀     -->
        <property name="prefix" value="/WEB-INF/jsp/"></property>
        <!--   后缀     -->
        <property name="suffix" value=".jsp"></property>
    </bean>

    <bean id="/hello" class="com.huang.controller.HelloController"/>
</beans>
```

![img_3.png](img_3.png)

