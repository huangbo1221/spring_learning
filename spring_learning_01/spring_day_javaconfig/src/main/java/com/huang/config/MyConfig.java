package com.huang.config;

import com.huang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyConfig
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/9 21:24
 * @Version 1.0
 */
@Configuration // 这个也会被spring容器托管，注册到容器中，因为它本来就是一个@Component。@Configuration代表
// 这是一个配置类，就相当于spring配置的beans.xml
@ComponentScan("com.huang.pojo") // 相当于<context:component-scan base-package="com.huang"/>
public class MyConfig {
    @Bean // 这个注解只能用在方法上，相当于之前在xml配置的bean标签
    // 这个方法的名字，就相当于bean标签的id属性
    // 这个方法的返回值，就相当于bean标签中的class属性
    public User getUser() {
        return new User();
    }

}
