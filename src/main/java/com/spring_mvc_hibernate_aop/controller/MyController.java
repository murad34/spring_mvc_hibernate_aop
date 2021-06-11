package com.spring_mvc_hibernate_aop.controller;

import com.spring_mvc_hibernate_aop.Employee;
import com.spring_mvc_hibernate_aop.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {

        List<Employee> allEmployees = employeeDAO.getAllEmployees();
        model.addAttribute("allEmps",allEmployees);

        return "all-employees";
    }

}
