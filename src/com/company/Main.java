package com.company;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.HandleCallback;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        String server = "server=localhost:3306;uid=root;pwd=zP0&3PF!i^GH;database=bookish";
        Jdbi jdbi = Jdbi.create("jdbc:mysql://localhost:3306/bookish?user=root&password=4q1WIfvybxBN&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT&ssl=true");

        List<Book> allBooks = jdbi.withHandle(new HandleCallback<List<Book>, Exception>() {
            public List<Book> withHandle(Handle handle) {
//                handle.execute("INSERT INTO books(title, subtitle, author, isbn) VALUES (?, ?, ?, ?)", "Where's Wally", "30th Anniversary Edition", "Martin Handford", "9781406375695");
//                handle.execute("DELETE FROM books WHERE bookId = 2");
//                handle.execute("DELETE FROM books WHERE bookId = 3");
                return handle.createQuery("SELECT * FROM books ORDER BY bookId")
                        .mapToBean(Book.class).list();
            }
        });

        for(Book book : allBooks)
            System.out.printf("%d - %s - %s - %s - %s\n", book.getBookId(), book.getTitle(), book.getSubtitle(), book.getAuthor(), book.getIsbn());
    }
}