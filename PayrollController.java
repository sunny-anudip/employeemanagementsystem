package com.employeemanagement.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.system.entity.Payroll;
import com.employeemanagement.system.serviceimpl.PayrollServiceImpl;
import com.employeemanagement.system.services.PayrollService;

@RestController
@RequestMapping("/api/payroll")
public class PayrollController {
    @Autowired
    private PayrollServiceImpl payrollServiceImpl;

    @PostMapping("/process")
    public Payroll processPayroll(@RequestBody Payroll payroll) {
        return payrollServiceImpl.processPayroll(payroll);
    }

    @GetMapping("/employee/{employeeId}")
    public List<Payroll> getPayrollByEmployee(@PathVariable Long employeeId) {
        return payrollServiceImpl.getPayrollByEmployee(employeeId);
    }

    // additional endpoints
}
