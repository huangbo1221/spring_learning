package com.huang.dao;

import com.huang.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @ClassName BlogMapper
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/28 21:13
 * @Version 1.0
 */
public interface BlogMapper {
    // 添加blog数据
    int addBlog(Blog blog);

    // 根据条件查询博客数据
    List<Blog> queryBlogByIf(Map<String, Object> map);

    // 只选择一个条件区查询，相当于java的switch语句
    List<Blog> queryBlogByChoose(Map<String, Object> map);

    // 更新博客
    void updateBlog(Map<String, Object> map);

    // 学习foreach的使用
    List<Blog> getBlogsByForEach1(Map<String, Object> map);

    // 学习foreach的使用
    List<Blog> getBlogsByForEach2(Map<String, Object> map);
}
