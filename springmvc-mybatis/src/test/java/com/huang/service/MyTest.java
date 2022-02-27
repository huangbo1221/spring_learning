package com.huang.service;

import com.huang.pojo.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/2/27 19:57
 * @Version 1.0
 */
public class MyTest {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookserviceimpl = (BookService) context.getBean("bookserviceimpl");
        List<Book> books = bookserviceimpl.getAllBook();
        books.forEach(book -> System.out.println(book));
    }
}
