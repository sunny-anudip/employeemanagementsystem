package com.employeemanagement.system.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employeemanagement.system.entity.LeaveRequest;

@Service
public interface LeaveRequestService
{
	public LeaveRequest submitLeaveRequest(LeaveRequest request);

    public List<LeaveRequest> getLeaveRequestsByEmployee(Long employeeId);

}
