# 整合springmvc和mybatis

## 报错排查

![img.png](img.png)

![img_1.png](img_1.png)

## 编写更新书籍的场景时，jsp如下的情况下怎么都无法更新书籍

![img_2.png](img_2.png)

可以这样考虑排错！

* 可能是sql该数据库时，需要配置事务（但是spring一般会自动配置事务，不需要自己主动去写，排错
时可以考虑为spring的事务没有生效）

```shell
<!-- 3、声明式事务的配置   -->
    <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
<!--     4、注入数据源   -->
        <property name="dataSource" ref="datasource"/>
    </bean>

<!-- 5、AOP事务的支持，需要导入aspectj包。结合AOP实现事务的织入  -->
    <!--   给那些方法配置事务     -->
    <!--   配置事务的传播特性：new  propagation    -->
    <!--   REQUIRED，没有事务时，补充事务    -->
    <tx:advice id="txAdvice" transaction-manager="transactionManager">
        <tx:attributes>
            <tx:method name="*" propagation="REQUIRED"/>
        </tx:attributes>
    </tx:advice>

<!--  配置事务的织入  -->
    <aop:config>
        <aop:pointcut id="txPointCut" expression="execution(* com.huang.dao.*.*(..))"/>
        <aop:advisor advice-ref="txAdvice" pointcut-ref="txPointCut"/>
    </aop:config>
```

按照如上配置了事务，依旧无法更新书籍！！！

再排查sql，会发现更新书籍时，是判断bookId的，但此时前端并没有传递bookId过来！