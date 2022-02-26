package com.huang.service;

import com.huang.dao.BookMapper;
import com.huang.pojo.Book;

import java.util.List;

/**
 * @ClassName BookServiceImpl
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/2/26 22:39
 * @Version 1.0
 */
public class BookServiceImpl implements BookService{

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Book queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Book> getAllBook() {
        return bookMapper.getAllBook();
    }
}
