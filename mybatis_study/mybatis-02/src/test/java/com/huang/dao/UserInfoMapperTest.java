package com.huang.dao;

import com.huang.pojo.User;
import com.huang.pojo.UserInfo;
import com.huang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

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
}
