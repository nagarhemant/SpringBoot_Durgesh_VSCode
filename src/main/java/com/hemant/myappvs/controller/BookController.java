package com.hemant.myappvs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hemant.myappvs.entity.Book;
import com.hemant.myappvs.service.BookService;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    //get all books handler
    @GetMapping("/books")
   public List<Book> getBooks(){
   
    return this.bookService.getAllBooks();
   }

   //get single book handler
   @GetMapping("/books/{id}")
   public Book getBook(@PathVariable ("id") int id){
    return bookService.getBookById(id);

   }

   //new book handler
   @PostMapping("/books")
   public Book addBook(@RequestBody Book book){

    this.bookService.addBook(book);
    return book;

   }

   //delete book handler


  
    }
     
    

