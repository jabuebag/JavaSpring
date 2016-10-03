package com.jabue.repository;

import com.jabue.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Kris on 2016-10-02.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByUsername(String username);
}
