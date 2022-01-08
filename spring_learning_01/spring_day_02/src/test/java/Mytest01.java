import com.huang.bo.pojo.Student;
import com.huang.bo.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Mytest01
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/4 22:33
 * @Version 1.0
 */
public class Mytest01 {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());
    }

    @Test
    public void test03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        User user = context.getBean("user2", User.class);
        System.out.println(user.toString());
    }

    @Test
    public void test04() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        User user3 = (User) context.getBean("user3");
        User user4 = (User) context.getBean("user3");
        System.out.println(user3 == user4);
    }

    @Test
    public void test05() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        User user4 = context.getBean("user4", User.class);
        User user5 = context.getBean("user4", User.class);
        System.out.println(user4 == user5);
    }
}
