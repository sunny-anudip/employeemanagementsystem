package com.employeemanagement.system.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employeemanagement.system.entity.Payroll;

@Service
public interface PayrollService 
{
	public Payroll processPayroll(Payroll payroll);
	
    public List<Payroll> getPayrollByEmployee(Long employeeId);
}
