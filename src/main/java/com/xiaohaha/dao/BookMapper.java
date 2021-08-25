package com.xiaohaha.dao;

import com.xiaohaha.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//一些接口操作
public interface BookMapper {
    int addBook(Books books);  //增加一本书
    int deleteBookById(@Param("bookId") int id);  //删除一本书
    int updateBook(Books books);  //更新一本书
    Books queryBookById(@Param("bookId") int id);   //查询一本书
//    @Select("select * from ssmbuild.books") 如果sql语句简单，这么写也可
    List<Books> queryAllBook();    //查询全部的书
    Books queryBookByName(@Param("bookName")String bookName);
}
