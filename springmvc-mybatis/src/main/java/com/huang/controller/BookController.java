package com.huang.controller;

import com.huang.pojo.Book;
import com.huang.service.BookService;
import com.huang.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName BookController
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/2/27 19:47
 * @Version 1.0
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("bookserviceimpl")
    private BookService bookService;

    @RequestMapping("/list")
    public String getAllBooks(Model model) {
        List<Book> books = bookService.getAllBook();
        model.addAttribute("list", books);
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddBook() {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Book book) {
        bookService.addBook(book);
        return "redirect:/book/list"; // 重定向到首页
    }
}
