package com.huang.dao;

import com.huang.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/15 21:04
 * @Version 1.0
 */
public interface UserMapper {
    // 获取全部用户
    List<User> getUserList();

    // 根据id查询用户
    User getUserById(Integer id);

    // 增加一个用户
    public void addUser(User user);

    // 更新用户
    void updateUserById(User user);

    // 删除一个用户
    void deleteUserById(Integer id);
}
