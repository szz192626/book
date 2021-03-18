package com.szz.book.controller;

import com.szz.book.entity.Book;
import com.szz.book.service.BookService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 囧态汗
 * @date 2021/3/18
 * @description BookController
 */
@Controller
@RequestMapping(value = "/")
public class BookController {
    @Resource
    private BookService bookService;

    @GetMapping()
    public String booPage(Model model){
        model.addAttribute("message","Hello SpringBoot");
        List<Book> bookList = bookService.getAll();
        model.addAttribute("bookList",bookList);
        return "book";
    }

}
