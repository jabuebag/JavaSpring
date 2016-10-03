package com.jabue.model;

import javax.persistence.*;

/**
 * Created by Kris on 2016-10-02.
 */
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;

    public User() {
    }

    public User(String password, String username) {
        this.password = password;
        this.username = username;
    }
}
