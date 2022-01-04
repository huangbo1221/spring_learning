import com.huang.bo.pojo.Student;
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
        System.out.println(student.getName());
    }
}
