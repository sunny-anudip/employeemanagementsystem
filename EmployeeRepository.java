package com.employeemanagement.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemanagement.system.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> 
{

}
