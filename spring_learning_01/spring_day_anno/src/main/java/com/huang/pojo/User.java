package com.huang.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @ClassName User
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/9 17:22
 * @Version 1.0
 */
// 这里的@Component注解相当于xml文件里配置的<bean id="user" class="com.huang.pojo.User"></bean>
@Component
@Data
@Scope("singleton")
public class User {
    /**
     * <bean id="user" class="com.huang.pojo.User">
     *         <property name="name" value="liubo"></property>
     * </bean>
     */
    @Value("liubo")
    private String name = "huangbo1221";
}
