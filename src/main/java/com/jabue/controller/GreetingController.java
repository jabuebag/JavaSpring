package com.jabue.controller;

import com.jabue.model.Greeting;
import com.jabue.model.User;
import com.jabue.repository.UserRepository;
import com.jabue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Kris on 2016-10-01.
 */
@RestController
@EnableAutoConfiguration
public class GreetingController {

    @Autowired
    private UserService userService;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        List<User> users = userService.getAllUsers();
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
