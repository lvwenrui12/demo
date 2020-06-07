package com.example.ormTest.controller;

import com.example.ormTest.entity.User;
import com.example.ormTest.repositoryInterface.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/index")
    public ResponseEntity<List<User>> index() {
        userRepository.save(new User("老王",18,"123456"));


         return  new ResponseEntity<>(userRepository.findAll(), HttpStatus.ACCEPTED);


    }
}