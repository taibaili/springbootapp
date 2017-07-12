package com.example.controllers;

import com.example.domain.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by yx198w on 7/9/2017.
 */
@RestController
//@RequestMapping(value="/users")
public class UserController {

    @RequestMapping(value="/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<Long, User> getUserList() {
        User user1 = new User(1L, "xiaoyang", 29);
        Map<Long, User> users = new HashMap<>();
        users.put(user1.getId(), user1);
        return users;
    }

    @RequestMapping(value="/users", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String postUser(User user) {
        System.out.println(user);
        return "success";
    }

}
