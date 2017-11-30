package com.smalltomato.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户服务 Controller
 * Created by feiL on 2017/11/30.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/login.action", method = RequestMethod.POST)
    public Object login(@RequestParam(value = "userName", required = true, defaultValue = "") String userName,
            @RequestParam(value = "password", required = true, defaultValue = "") String password) {
        System.out.println("uerNmae: " + userName + ", password: " + password);
        return null;
    }
}
