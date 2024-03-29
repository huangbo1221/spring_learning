package huang.dao;

import huang.pojo.User;
import org.apache.ibatis.annotations.*;

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
    @Select("select id, userCode, userName from smbms_user")
    List<User> getUserList();

    @Select("select id, userCode, userName from smbms_user where id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into smbms_user (id, userCode, UserName) values (#{id}, #{userCode}, #{userName})")
    void addUser(User user);

    @Update("update smbms_user set userCode = #{userCode}, userName = #{userName} where id = #{id}")
    void updateUserById(@Param("id") int id, @Param("userCode") String userCode, @Param("userName") String userName);

    @Delete("delete from smbms_user where id = #{id}")
    void deleteUserById(@Param("id") int id);
}
