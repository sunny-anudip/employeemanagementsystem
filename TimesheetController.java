package com.employeemanagement.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.system.entity.Timesheet;
import com.employeemanagement.system.serviceimpl.TimesheetServiceImpl;
import com.employeemanagement.system.services.TimesheetService;

@RestController
@RequestMapping("/api/timesheet")
public class TimesheetController {
    @Autowired
    private TimesheetServiceImpl timesheetServiceImpl;

    @PostMapping("/submit")
    public Timesheet submitTimesheet(@RequestBody Timesheet timesheet) {
        return timesheetServiceImpl.submitTimesheet(timesheet);
    }

    @GetMapping("/employee/{employeeId}")
    public List<Timesheet> getTimesheetsByEmployee(@PathVariable Long employeeId) {
        return timesheetServiceImpl.getTimesheetsByEmployee(employeeId);
    }

    // additional endpoints
}

