package com.java.web.service;

import com.java.web.bo.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Varun Maurya on 3/13/2017.
 */
@RestController
public class UserController {
    private static Logger logger = LogManager.getLogger(UserController.class);

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public User getUser(){
            return new User();
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.POST)
    public User addUser(){
        return new User();
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public User updateUser(){
        return new User();
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public User deleteUser(){
        return new User();
    }


}
