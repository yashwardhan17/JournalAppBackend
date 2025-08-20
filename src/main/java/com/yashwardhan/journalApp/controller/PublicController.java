package com.yashwardhan.journalApp.controller;

import com.yashwardhan.journalApp.entity.User;
import com.yashwardhan.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class PublicController {

    @Autowired
    private UserService userService;

    @PostMapping("/create-user")
    public void createUser(@RequestBody User user){
        userService.saveEntry(user);
    }

    @GetMapping("/health-check")
    public String HealthCheck(){
        return "OK";
    }
}
