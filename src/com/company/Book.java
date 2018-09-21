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

    private static List<Book> bookList = new ArrayList();

    public Book(int bookId, String title, String subtitle, String author, int isbn) {
        this.bookId = bookId;
        this.title = title;
        this.subtitle = subtitle;
        this.author = author;
        this.isbn = isbn;
    }

    public void setBookId(int bookId)
    {
        this.bookId = bookId;
    }

    public int getBookId()
    {
        return bookId;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setSubtitle(String subtitle)
    {
        this.subtitle = subtitle;
    }

    public String getSubtitle()
    {
        return subtitle;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setIsbn(int isbn)
    {
        this.isbn = isbn;
    }

    public int getIsbn()
    {
        return isbn;
    }

//    private Book()
//    {
//
//    }
//
//    public static Book getBookFromId(int bookId)
//    {
//        Book book = new Book();
//        for(Book b : bookList)
//        {
//            if(b.getBookId() == bookId)
//            {
//                book = b;
//                break;
//            }
//        }
//        return book;
//    }
//
//    private int getBookId() { return this.bookId; }
}
