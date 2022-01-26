package huang.pojo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName Teacher
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/25 22:46
 * @Version 1.0
 */
@Data
public class Teacher {
    private Integer id;

    private String name;

    /**
     * 一个老师必定带多个学生
     */
    private List<Student> students;
}
