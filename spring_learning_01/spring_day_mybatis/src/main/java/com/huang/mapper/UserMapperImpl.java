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
    // 我们的所有操作，在原来都使用sqlsession来执行，现在都使用SqlSessionTemplate
    SqlSessionTemplate sqlSession;

    @Override
    public List<User> selectUsers() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUsers();
        return users;
    }
}
