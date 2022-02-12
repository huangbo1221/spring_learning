package com.huang.mapper;

import com.huang.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @ClassName UserMapperImpl
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/2/12 12:21
 * @Version 1.0
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{
    @Override
    public List<User> selectUsers() {
        User user = new User(16, "bo16", "bobobo");
        addUser(user);
        deleteUser(16);
        return getSqlSession().getMapper(UserMapper.class).selectUsers();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
