package com.xiaohaha.controller;

import com.xiaohaha.pojo.Books;
import com.xiaohaha.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
//    Controller层调用service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部书籍，并且返回到一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books>  list =bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }

    //跳转到增加书籍界面
    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println(books);
        bookService.addBook(books);
        System.out.println("hello boy");
        return "redirect:/book/allBook";   //重定向到@RequestMapping("/allBook")请求
    }

    //跳转到修改书籍界面
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id,Model model){
        Books book=bookService.queryBookById(id);
        model.addAttribute("book",book);
        return "updateBook";
    }

    //修改书籍的请求
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        bookService.updateBook(books);
        return "redirect:/book/allBook";   //重定向到@RequestMapping("/allBook")请求
    }

    //删除书籍的请求
    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBookById(@PathVariable("bookID") int id){   //rust风格
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";   //重定向到@RequestMapping("/allBook")请求
    }

    @RequestMapping("queryBook")
    public String queryBook(String queryBookName,Model model){
        Books book=bookService.queryBookByName(queryBookName);
        List<Books> list=new ArrayList<Books>();
        list.add(book);
        if (book==null){
            list=bookService.queryAllBook();
            model.addAttribute("error","未查到");
        }

        model.addAttribute("list",list);
        return "allBook";
    }
}
