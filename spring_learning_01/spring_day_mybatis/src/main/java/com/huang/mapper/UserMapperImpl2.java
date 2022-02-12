package com.huang.mapper;

import com.huang.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @ClassName UserMapperImpl2
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/2/12 11:01
 * @Version 1.0
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{
    @Override
    public List<User> selectUsers() {
        return getSqlSession().getMapper(UserMapper.class).selectUsers();
    }
}
