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

    @Test
    public void test02() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getAutoCommitSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User userById = mapper.getUserById(3);
            System.out.println(userById);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test03() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getAutoCommitSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);

            User user1 = new User();
            user1.setId(3);
            user1.setUserCode("3333333");
            user1.setUserName("name33333");

            mapper.addUser(user1);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test04() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getAutoCommitSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);

            mapper.updateUserById(3, "3gai", "namegai");
            User userById = mapper.getUserById(3);
            System.out.println(userById);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test05() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getAutoCommitSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);

            mapper.deleteUserById(3);
            User userById = mapper.getUserById(3);
            System.out.println(userById);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
