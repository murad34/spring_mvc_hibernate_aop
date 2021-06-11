package com.spring_mvc_hibernate_aop.service;

import com.spring_mvc_hibernate_aop.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

}
