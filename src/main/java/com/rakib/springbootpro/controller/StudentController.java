package com.rakib.springbootpro.controller;

import com.rakib.springbootpro.Employee;
import com.rakib.springbootpro.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private EmployeeDAO employeeDAO;
    /*Inject Properties*/
    @Value("${team.name}")
    private String teamName;
    @Value("${captain.name}")
    private String captainName;

    @Autowired
    public StudentController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/teamInfo")
    public String teamInfo() {
        return "Team Name : " + teamName + " Captain Name  :  " + captainName;
    }

    @GetMapping("/hello")
    public String greeting() {
        return "Hello Rakib ! Start From 0";
    }

    @GetMapping("/employeeList")
    List<Employee> employeeList() {
        return employeeDAO.findAll();
    }
}
