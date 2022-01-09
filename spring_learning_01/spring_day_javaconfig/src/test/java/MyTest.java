import com.huang.config.MyConfig;
import com.huang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/9 21:25
 * @Version 1.0
 */
public class MyTest {
    @Test
    public void test01() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user1 = context.getBean("getUser", User.class);
        System.out.println(user1.getName());

        User user2 = context.getBean("user", User.class);
        System.out.println(user2.getName());

        System.out.println(user1 == user2);
    }
}
