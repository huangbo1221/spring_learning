package com.huang.mapper;

import com.huang.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectUsers();

    // 添加一个用户
    public int addUser(User user);

    // 删除用户
    public int deleteUser(int id);
}
