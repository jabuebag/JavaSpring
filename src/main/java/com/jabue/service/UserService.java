package com.jabue.service;

import com.jabue.model.User;
import com.jabue.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kris on 2016-10-02.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {

        return userRepository.findByUsername("guest");
    }
}
