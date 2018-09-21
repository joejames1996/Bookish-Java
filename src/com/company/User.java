package com.company;

import java.util.Date;

public class User
{
    private int userId;
    private String firstName;
    private String surname;
    private String userName;
    private String password;
    private Date dateOfBirth;

    public User(int userId, String firstName, String surname, String userName, String password, Date dateOfBirth)
    {
        this.userId = userId;
        this.firstName = firstName;
        this.surname = surname;
        this.userName = userName;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
    }
}
