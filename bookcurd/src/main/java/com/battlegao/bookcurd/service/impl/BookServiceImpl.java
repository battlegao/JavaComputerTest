package com.battlegao.bookcurd.service.impl;

import com.battlegao.bookcurd.dao.BookMapper;
import com.battlegao.bookcurd.model.Book;
import com.battlegao.bookcurd.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service   //利用注解证明其为具体实现类
public class BookServiceImpl implements BookService {


    //利用dao层抽象接口方法实现
    @Autowired
    BookMapper bookMapper;

    @Override
    public int addBook(Book book) {
        //实现功能
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBook(int bno) {
        return bookMapper.deleteBook(bno);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public List<Book> findAllBook() {


        return bookMapper.findAllBook();
    }

    @Override
    public List<Book> findBookById(int bno) {


        return bookMapper.findBookById(bno);
    }

    @Override
    public List<Book> findBookByName(String bname) {


        return bookMapper.findBookByName(bname);
    }
}