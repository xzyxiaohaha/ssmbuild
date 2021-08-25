package com.xiaohaha.service;

import com.xiaohaha.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    int addBook(Books books);  //增加一本书
    int deleteBookById(int id);  //删除一本书
    int updateBook(Books books);  //更新一本书
    Books queryBookById(int id);   //查询一本书
    List<Books> queryAllBook();    //查询全部的书
    Books queryBookByName(String bookName);
}
