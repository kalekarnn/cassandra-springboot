package com.narendra.springboot.db.cassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Book getBookById(int isbn){
       return bookRepository.findAll().get(0);
    }

    public Book createBook(Book book){
        return bookRepository.save(book);
    }
}
