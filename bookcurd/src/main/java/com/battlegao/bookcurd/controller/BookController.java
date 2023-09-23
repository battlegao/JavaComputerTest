package com.battlegao.bookcurd.controller;

import com.battlegao.bookcurd.model.Book;
import com.battlegao.bookcurd.service.BookService;
import com.battlegao.bookcurd.tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //控制器注解
@CrossOrigin  //跨域注解
@RequestMapping(value = "/book")
public class BookController {


    @Autowired
    BookService bookService;

    @RequestMapping("/addBook")
    public Result addBook(Book book) {


        //打印需要加入的书籍信息
        System.out.println(book);
        //利用服务层接口方法进行功能实现
        int result = bookService.addBook(book);
        //判断是否成功
        if (result > 0) {

            return Result.ok("增加书籍成功");
        }
        return Result.error("增加书籍失败");
    }

    @RequestMapping("/deleteBook")
    public Result deleteBook(int bno) {


        //打印删除的书籍编号
        System.out.println(bno);
        //利用服务层接口方法进行功能实现
        int result = bookService.deleteBook(bno);
        //判断是否成功
        if (result > 0) {

            return Result.ok("删除书籍成功");
        }
        return Result.error("删除书籍失败");
    }

    @RequestMapping("/updateBook")
    public Result updateBook(Book book) {

        //打印修改的书籍信息
        System.out.println(book);
        //利用服务层接口方法进行功能实现
        int result = bookService.updateBook(book);
        //判断是否成功
        if (result > 0) {

            return Result.ok("修改书籍成功");
        }
        return Result.error("修改书籍失败");
    }

    @RequestMapping("/findAllBook")
    public Result findAllBook() {


        //返回json格式的数据，key构造为data
        return Result.ok().put("data", bookService.findAllBook());
    }

    @RequestMapping("/findBookById")
    public Result findBookById(int bno) {


        //打印输入的书籍编号
        System.out.println(bno);
        return Result.ok().put("data", bookService.findBookById(bno));
    }

    @RequestMapping("/findBookByName")
    public Result findBookByName(String bname) {


        //打印输入的书籍名称
        System.out.println(bname);
        return Result.ok().put("data", bookService.findBookByName(bname));
    }


}