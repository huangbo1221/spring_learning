package huang.dao;

import huang.pojo.User;
import huang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName UserTest
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/20 22:26
 * @Version 1.0
 */
public class UserTest {
    @Test
    public void test01() {
        SqlSession sqlSession = null;

        try {
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();
            userList.forEach(user -> System.out.println(user));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
