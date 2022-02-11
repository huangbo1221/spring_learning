package com.huang.mapper;

import com.huang.pojo.User;
import lombok.Data;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @ClassName UserMapperImpl
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/2/11 23:04
 * @Version 1.0
 */
@Data
public class UserMapperImpl implements UserMapper{
    SqlSessionTemplate sqlSession;

    @Override
    public List<User> selectUsers() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUsers();
        return users;
    }
}
