import huang.dao.TeacherMapper;
import huang.pojo.Teacher;
import huang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName MyTest01
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/25 23:01
 * @Version 1.0
 */
public class MyTest01 {
    @Test
    public void test01() {
        SqlSession sqlSession = null;

        try {
            sqlSession = MybatisUtils.getSqlSession();
            TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
            List<Teacher> allTeachers = mapper.getAllTeachers();
            allTeachers.forEach(t -> System.out.println(t));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
