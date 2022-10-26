package com.hemant.myappvs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.hemant.myappvs.entity.Book;

@Service
public class BookService {

    private static  List<Book> list=new ArrayList<>();
    
    static{
        list.add(new Book(18, "Python", "Travos"));
        list.add(new Book(19, "Javascript", "Kent"));
        list.add(new Book(20, "C#", "Roger"));
        
    }

    //get all books
    public List<Book>getAllBooks(){
        return list;
    }

    //get a single book by id

    public Book getBookById(int id){

        Book book=null;
        book=list.stream().filter(e->e.getId()==id).findFirst().get();
        return book;
    }
   
    //adding the book
    public Book addBook(Book book){
        list.add(book);
        return book;
    }

    //delete book

    public void deleteBook(int bid){

       list = list.stream().filter(book->book.getId()!=bid).collect(Collectors.toList());
    }
}
