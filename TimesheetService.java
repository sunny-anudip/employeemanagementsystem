package com.employeemanagement.system.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employeemanagement.system.entity.Timesheet;

@Service
public interface TimesheetService 
{
	public Timesheet submitTimesheet(Timesheet timesheet);

    public List<Timesheet> getTimesheetsByEmployee(Long employeeId);
}
