import com.huang.mapper.UserMapper;
import com.huang.mapper.UserMapperImpl;
import com.huang.mapper.UserMapperImpl2;
import com.huang.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/11 23:07
 * @Version 1.0
 */
public class MyTest {
    @Test
    public void test01() throws IOException {
        String resources = "mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resources);
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUsers();
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void test02() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperImpl userMapper = context.getBean("userMapper", UserMapperImpl.class);
        List<User> users = userMapper.selectUsers();
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void test03() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperImpl2 userMapper = context.getBean("userMapper2", UserMapperImpl2.class);
        List<User> users = userMapper.selectUsers();
        users.forEach(user -> System.out.println(user));
    }
}
