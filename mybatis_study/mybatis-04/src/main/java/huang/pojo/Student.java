package huang.pojo;

import lombok.Data;

/**
 * @ClassName Student
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/25 22:47
 * @Version 1.0
 */
@Data
public class Student {
    private int id;

    private String name;

    // 每个学生有一位老师
    private Teacher teacher;
}
