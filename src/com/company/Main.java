package com.company;

import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Jdbi jdbi = Jdbi.create()
        List<Book> allBooks = jdbi.withHandle(handle -> {

        });
    }
}
