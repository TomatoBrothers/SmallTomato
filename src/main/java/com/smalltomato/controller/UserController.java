package com.smalltomato.controller;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
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
@Api(value = "/user", description = "用户的相关操作")
public class UserController {

    @RequestMapping(value = "/login.action", method = RequestMethod.POST)
    @ApiOperation(value = "用户登录", httpMethod = "POST", notes = "/login.action")
    public Object login(
            @ApiParam(required = true, value = "用户姓名", name = "userName") @RequestParam(value = "userName", required = true, defaultValue = "") String userName,
            @ApiParam(required = true, value = "用户密码", name = "password") @RequestParam(value = "password", required = true, defaultValue = "") String password) {
        System.out.println("uerNmae: " + userName + ", password: " + password);
        return null;
    }
}
