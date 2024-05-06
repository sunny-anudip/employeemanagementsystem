package com.employeemanagement.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.system.entity.Employee;
import com.employeemanagement.system.serviceimpl.EmployeeServiceImpl;
import com.employeemanagement.system.services.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/register")
    public Employee registerEmployee(@RequestBody Employee employee) {
        return employeeServiceImpl.registerEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeServiceImpl.getAllEmployees();
    }

    // additional endpoints
}
