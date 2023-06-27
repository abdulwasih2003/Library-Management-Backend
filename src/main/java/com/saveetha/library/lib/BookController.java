package com.saveetha.library.lib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/v1/book")
public class BookController {
    private final BookService bookService;
    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")

    public List<Book> getBookDetails(){

        return bookService.displayBookDetails();
    }
    @PostMapping("/")
    public void postBook(@RequestBody Book book){
        bookService.registerNewBook(book);
    }
    @DeleteMapping(path={"/{id}"})
    public void deleteBook(@PathVariable("id") Long bookID){
        bookService.removeBook(bookID);
    }
    
}
