package com.employeemanagement.system.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.system.entity.Employee;
import com.employeemanagement.system.repository.EmployeeRepository;

@Service
public interface EmployeeService 
{

    public Employee registerEmployee(Employee employee);

    public List<Employee> getAllEmployees();
    
}
