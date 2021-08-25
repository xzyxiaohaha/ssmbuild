package com.xiaohaha.service;

import com.xiaohaha.dao.BookMapper;
import com.xiaohaha.pojo.Books;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

public class BookServiceImpl implements BookService{
    //service业务层调用dao层：组合dao层
    private BookMapper bookMapper;

    //这样spring就可自动注入
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
