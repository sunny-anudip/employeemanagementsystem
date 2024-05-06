package com.employeemanagement.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemanagement.system.entity.Timesheet;

public interface TimesheetRepository extends JpaRepository<Timesheet, Long>
{

}
