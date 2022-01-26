package huang.dao;

import huang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getAllTeachers();

    List<Teacher> getTeacherAndStuById(@Param("id") Integer id);
}
