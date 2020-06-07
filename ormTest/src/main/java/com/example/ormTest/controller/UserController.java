package com.example.ormTest.controller;

import com.example.ormTest.entity.Employee;
import com.example.ormTest.entity.User;
import com.example.ormTest.repositoryInterface.EmployeeRepository;
import com.example.ormTest.repositoryInterface.UserRepository;
import com.example.ormTest.servcie.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping("/index")
    public ResponseEntity<List<User>> index() {
        userRepository.save(new User("老王",18,"123456"));


         return  new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);


    }

    @RequestMapping("/findAllEmployee")
    public ResponseEntity< List<Map<String, Object>>> findAllEmployee(){

        List<Map<String, Object>> allEmployee = employeeService.findAllEmployee();

        return new ResponseEntity<>(allEmployee,HttpStatus.OK);
    }

}