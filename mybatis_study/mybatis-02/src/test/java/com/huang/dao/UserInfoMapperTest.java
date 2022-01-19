package com.huang.dao;

import com.huang.pojo.User;
import com.huang.pojo.UserInfo;
import com.huang.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
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
public class UserInfoMapperTest {
    private static final Logger logger = Logger.getLogger(UserInfoMapperTest.class);

    @Test
    public void test02() {
        SqlSession sqlSession = null;

        try {
            sqlSession = MybatisUtils.getSqlSession();
            UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
            UserInfo user = mapper.getUserById(1);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test01() {
        logger.info("enter UserInfoMapperTest.test01 method!");
        System.out.println("hhhhhh");
        logger.info("finish test01 method!");
    }

    @Test
    public void test03() {
        SqlSession sqlSession = null;

        try {
            sqlSession  = MybatisUtils.getSqlSession();
            UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
            Map<String, Object> map = new HashMap<>();
            map.put("startIndex", 0);
            map.put("pageSize", 2);
            List<UserInfo> userByLimit = mapper.getUserByLimit(map);
            userByLimit.forEach(user -> System.out.println(user));
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
            // 采用RowBounds来实现分页
            RowBounds rowBounds = new RowBounds(0, 2);
            List<UserInfo> userInfos = sqlSession.selectList("com.huang.dao.UserInfoMapper.getUserByRowBounds", null, rowBounds);
            userInfos.forEach(userInfo -> System.out.println(userInfo));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
