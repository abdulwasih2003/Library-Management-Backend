package com.saveetha.library.lib;

import jakarta.persistence.*;

@Entity
@Table
public class Book {
    @Id
    @SequenceGenerator(
            name="book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_sequence"
    )
    private Long bookID;
    private String bookName;
    private String authorName;
    private Integer copiesCount;

    public Book() {
    }

    public Book(Long bookID, String bookName, String authorName, Integer copiesCount) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.authorName = authorName;
        this.copiesCount = copiesCount;
    }

    public Long getBookID() {
        return bookID;
    }

    public void setBookID(Long bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getCopiesCount() {
        return copiesCount;
    }

    public void setCopiesCount(Integer copiesCount) {
        this.copiesCount = copiesCount;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookID=" + bookID +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", copiesCount=" + copiesCount +
                '}';
    }
}
