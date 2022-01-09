import com.huang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/9 17:26
 * @Version 1.0
 */
public class MyTest {
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = context.getBean("user", User.class);
        System.out.println(user1.getName());
    }
}
