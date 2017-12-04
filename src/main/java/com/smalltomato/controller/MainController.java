package com.smalltomato.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WangShiChong
 * @ Create Time: 2017/11/28/0028 23:10
 */
@Controller
@RequestMapping("main")
public class MainController {

    @RequestMapping("/index")
    public String login() {
        System.out.println("程序到此一游！");
        return "/index";
    }

}