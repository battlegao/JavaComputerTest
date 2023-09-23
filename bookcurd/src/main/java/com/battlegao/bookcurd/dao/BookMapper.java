
package com.battlegao.bookcurd.dao;

import com.battlegao.bookcurd.model.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper   //采用注解，表示其为抽象接口类
public interface BookMapper {


    //增加数据方法
    //传入的是整本书籍的数据
    int addBook(Book book);

    //删除数据方法  根据书籍编号删除
    int deleteBook(int bno);

    //修改数据方法  根据书籍编号修改数据内容
    int updateBook(Book book);

    //注：查询一条数据，Book和List<Book>都可以
    //注：查询多条数据，只能List<Book>
    //注：所以为了方便，统一使用List<Book>
    //查询数据方法  查询全部书籍
    List<Book> findAllBook();

    //查询数据方法  根据书籍编号进行查询
    List<Book> findBookById(int bno);

    //查询数据方法  根据书籍名称进行查询
    List<Book> findBookByName(String bname);

}