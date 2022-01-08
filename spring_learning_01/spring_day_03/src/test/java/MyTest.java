import com.huang.pojo.Bear;
import com.huang.pojo.Monkey;
import com.huang.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/8 21:18
 * @Version 1.0
 */
public class MyTest {
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = context.getBean("person", Person.class);
        person.getCat().shout();
        person.getDog().shout();
    }

    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = context.getBean("person2", Person.class);
        person.getCat().shout();
        person.getDog().shout();
    }

    @Test
    public void test03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = context.getBean("person2", Person.class);
        person.getCat().shout();
        person.getDog().shout();
        person.getHands().useHands();
    }

    @Test
    public void test04() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = context.getBean("person4", Person.class);
        person.getCat().shout();
        person.getDog().shout();
        person.getHands().useHands();
    }

    @Test
    public void test05() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Monkey monkey = context.getBean("monkey", Monkey.class);
        System.out.println(monkey.getHands().toString());
    }

    @Test
    public void test06() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Bear bear = context.getBean("bear", Bear.class);
        System.out.println(bear.getHands().toString());
    }
}
