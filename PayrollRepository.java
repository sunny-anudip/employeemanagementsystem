package com.employeemanagement.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemanagement.system.entity.Payroll;

public interface PayrollRepository extends JpaRepository<Payroll, Long>
{

}
