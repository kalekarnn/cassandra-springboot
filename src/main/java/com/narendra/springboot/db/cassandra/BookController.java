package com.narendra.springboot.db.cassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping(value = "/{isbn}")
    public Book getBookById(@PathVariable int isbn){
        return bookService.getBookById(isbn);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }
}
