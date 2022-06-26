package com.huang.service;

import com.huang.pojo.Book;

import java.util.List;

public interface BookService {

    int addBook(Book book);

    int deleteBookById(int id);

    int updateBook(Book book);

    Book queryBookById(int id);

    List<Book> getAllBook();

    List<Book> queryBookByName(String queryBookName);
}
