package com.example.testmovie.controller;

import com.example.testmovie.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movie")
public class HomeController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/home")
    public String home(){
        return "index";
    }

    @RequestMapping("/user")
    public String user(Model model){
        model.addAttribute()
        return "hello";
    }
}
