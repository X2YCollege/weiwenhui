package com.group.weiwenhui.controller;

import com.group.weiwenhui.mapper.UserMapper;
import com.group.weiwenhui.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class testController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String testMethod() {
        return "haha";
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<User> getall() {
        return userMapper.getAll();
    }
}
