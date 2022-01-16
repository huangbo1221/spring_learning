package com.huang.dao;

import com.huang.pojo.User;
import com.huang.pojo.UserInfo;

import java.util.List;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/15 21:04
 * @Version 1.0
 */
public interface UserInfoMapper {
    // 根据id查询用户
    UserInfo getUserById(Integer id);
}
