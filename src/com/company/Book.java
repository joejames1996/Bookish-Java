package com.company;

import java.util.ArrayList;
import java.util.List;

public class Book
{
    private int bookId;
    private String title;
    private String subtitle;
    private String author;
    private int isbn;

    private static List<Book> bookList = new ArrayList<>();

    public Book(int bookId, String title, String subtitle, String author, int isbn)
    {
        this.bookId = bookId;
        this.title = title;
        this.subtitle = subtitle;
        this.author = author;
        this.isbn = isbn;
    }

    private Book()
    {

    }

    public static Book getBookFromId(int bookId)
    {
        Book book = new Book();
        for(Book b : bookList)
        {
            if(b.getBookId() == bookId)
            {
                book = b;
                break;
            }
        }
        return book;
    }

    private int getBookId() { return this.bookId; }
}
