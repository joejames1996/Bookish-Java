package com.company;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.HandleCallback;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        String server = "server=localhost:3306;uid=root;pwd=zP0&3PF!i^GH;database=bookish";
        Jdbi jdbi = Jdbi.create("jdbc:mysql://localhost:3306/bookish?user=root&password=4q1WIfvybxBN&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT");

        List<Book> allBooks = jdbi.withHandle(new HandleCallback<List<Book>, Exception>() {
            public List<Book> withHandle(Handle handle) {
                return handle.createQuery("SELECT * FROM books ORDER BY title")
                        .mapToBean(Book.class).list();
            }
        });

        System.out.println(allBooks);
    }
}
