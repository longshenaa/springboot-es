package com.ls.es.controller;

import com.ls.es.dao.UserDao;
import com.ls.es.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;
    @RequestMapping("/addUser")
    public void addUser(@RequestBody UserEntity userEntity) {
        userDao.save(userEntity);
    }
    @RequestMapping("/getUser")
    public Optional<UserEntity> getUser(String id) {
        return userDao.findById(id);
    }
}
