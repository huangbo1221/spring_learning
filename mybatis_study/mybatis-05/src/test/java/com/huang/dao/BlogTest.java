package com.huang.dao;

import com.huang.pojo.Blog;
import com.huang.utils.IDUtils;
import com.huang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName BlogTest
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/28 21:30
 * @Version 1.0
 */
public class BlogTest {
    @Test
    public void test01() {
        Blog blog1 = new Blog();
        blog1.setId(IDUtils.getUUID());
        blog1.setAuthor("huangbo");
        blog1.setTitle("first title");
        blog1.setViews(1);
        blog1.setCreateTime(new Date());

        Blog blog2 = new Blog();
        blog2.setId(IDUtils.getUUID());
        blog2.setAuthor("huanghuang");
        blog2.setTitle("second title");
        blog2.setViews(2);
        blog2.setCreateTime(new Date());

        Blog blog3 = new Blog();
        blog3.setId(IDUtils.getUUID());
        blog3.setAuthor("bobo");
        blog3.setTitle("third title");
        blog3.setViews(3);
        blog3.setCreateTime(new Date());

        SqlSession sqlSession = null;

        try {
            sqlSession = MybatisUtils.getSqlSession();
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            mapper.addBlog(blog1);
            mapper.addBlog(blog2);
            mapper.addBlog(blog3);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test02() {
        SqlSession sqlSession = null;

        try {
            sqlSession = MybatisUtils.getAutoCommitSqlSession();
            Map<String, Object> params = new HashMap<>();
            params.put("title", "%title%");
            params.put("author", "huangbo");
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            List<Blog> blogs = mapper.queryBlogByIf(params);
            blogs.forEach(blog -> System.out.println(blog));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test03() {
        SqlSession sqlSession = null;

        try {
            sqlSession = MybatisUtils.getAutoCommitSqlSession();
            Map<String, Object> params = new HashMap<>();
//            params.put("title", "%title%");
//            params.put("author", "huangbob");
            params.put("views", 3);
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            List<Blog> blogs = mapper.queryBlogByChoose(params);
            blogs.forEach(blog -> System.out.println(blog));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test04() {
        SqlSession sqlSession = null;

        try {
            sqlSession = MybatisUtils.getAutoCommitSqlSession();
            Map<String, Object> params = new HashMap<>();
            params.put("title", "title_modified");
            params.put("author", "huangbo_modified");
            params.put("id", "9fc3b8173fa54a8990120167ad11b51c");
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            mapper.updateBlog(params);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
