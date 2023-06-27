package com.saveetha.library.lib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BookService {
    private final BookRepository bookRepository;
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> displayBookDetails() {

        return bookRepository.findAll();
    }

    public void registerNewBook(Book book) {
        bookRepository.save(book);
    }

    public void removeBook(Long bookID) {
        boolean bookExists=bookRepository.existsById(bookID);
        if(!bookExists)
        {
            throw new IllegalStateException("Book with ID "+bookID+"doesn't exist");
        }
        bookRepository.deleteById(bookID);
    }

}
