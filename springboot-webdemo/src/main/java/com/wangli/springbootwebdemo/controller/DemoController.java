package com.wangli.springbootwebdemo.controller;


import com.wangli.springbootwebdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangli
 */
@Controller
public class DemoController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/addOne")
    @ResponseBody
    Boolean add(Integer age, String name) {
        return userService.addUser(age, name);
    }
}
