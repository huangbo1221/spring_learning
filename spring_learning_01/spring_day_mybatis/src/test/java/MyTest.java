import com.huang.mapper.UserMapper;
import com.huang.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

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
}
