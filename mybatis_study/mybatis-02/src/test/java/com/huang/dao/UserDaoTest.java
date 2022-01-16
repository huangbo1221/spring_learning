package com.huang.dao;

import com.huang.pojo.User;
import com.huang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName UserDaoTest
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/15 21:27
 * @Version 1.0
 */
public class UserDaoTest {
    @Test
    public void test01() {
        // 第一步：获取sqlsession来执行sql
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 执行sql的所有方式
        // 方式一：getMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();
        userList.forEach(user -> System.out.println(user));

        System.out.println("===============================================");
        // 方式二：指定调用的方法
        List<User> objectList = sqlSession.selectList("com.huang.dao.UserMapper.getUserList");
        objectList.forEach(user -> System.out.println(user));
        // 如果查询单条数据，则使用sqlSession.selectOne
        // 关掉会话，避免内存泄漏
        sqlSession.close();
    }

    @Test
    public void test02() {
        SqlSession sqlSession = null;

        try {
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.getUserById(1);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    /**
     * 增删改必须提交事务！！！否则数据不会更新到数据库
     */
    @Test
    public void test03() {
        SqlSession sqlSession = null;

        try {
            sqlSession = MybatisUtils.getSqlSession();
            User user = new User();
            user.setId(3);
            user.setUserName("huangbo");
            user.setUserCode("5151515");
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            mapper.addUser(user);
            // 提交事务
            sqlSession.commit();
            User user1 = mapper.getUserById(3);
            System.out.println(user1);
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
            sqlSession = MybatisUtils.getSqlSession();
            User user = new User();
            user.setId(3);
            user.setUserName("liubo");
            user.setUserCode("777777");
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            mapper.updateUserById(user);
            sqlSession.commit();
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
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            mapper.deleteUserById(3);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
