package com.felipe.todolist.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.todolist.models.UserModel;

@RestController
@RequestMapping("/user")
public class UserController {

  @PostMapping("/create")
  public UserModel createUser(@RequestBody UserModel userModel){  
    return userModel;
  }
}
