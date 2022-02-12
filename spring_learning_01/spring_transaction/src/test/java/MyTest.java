import com.huang.mapper.UserMapper;
import com.huang.mapper.UserMapperImpl;
import com.huang.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/2/12 12:24
 * @Version 1.0
 */
public class MyTest {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        List<User> users = userMapper.selectUsers();
        users.forEach(user -> System.out.println(user));
    }
}
