package com.company;

public class Copy
{
    private int copyId;
    private Book book;

    public Copy(int copyId, int bookId)
    {
        this.copyId = copyId;
        this.book = Book.getBookFromId(bookId);
    }
}
