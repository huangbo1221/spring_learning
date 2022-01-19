package com.huang.dao;

import com.huang.pojo.User;
import com.huang.pojo.UserInfo;

import java.util.List;
import java.util.Map;

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

    // 分页查询数据
    List<UserInfo> getUserByLimit(Map<String, Object> map);

    // 通过RowBounds分页
    List<UserInfo> getUserByRowBounds();
}
