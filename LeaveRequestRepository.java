package com.employeemanagement.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemanagement.system.entity.LeaveRequest;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Long>
{

}
