package huang.dao;

import huang.pojo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> getAllStudents();

    List<Student> getAllStudents2();
}
