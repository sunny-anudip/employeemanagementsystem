package com.employeemanagement.system.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.employeemanagement.system.entity.Employee;
import com.employeemanagement.system.repository.EmployeeRepository;
import com.employeemanagement.system.services.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
    private EmployeeRepository employeeRepository;

	@Override
	public Employee registerEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		 return employeeRepository.findAll();
	}

}
