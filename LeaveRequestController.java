package com.employeemanagement.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.system.entity.LeaveRequest;
import com.employeemanagement.system.serviceimpl.LeaveRequestServiceImpl;
import com.employeemanagement.system.services.LeaveRequestService;

@RestController
@RequestMapping("/api/leave")
public class LeaveRequestController {
    @Autowired
    private LeaveRequestServiceImpl leaveRequestServiceImpl;

    @PostMapping("/submit")
    public LeaveRequest submitLeaveRequest(@RequestBody LeaveRequest leaveRequest) {
        return leaveRequestServiceImpl.submitLeaveRequest(leaveRequest);
    }

    @GetMapping("/employee/{employeeId}")
    public List<LeaveRequest> getLeaveRequestsByEmployee(@PathVariable Long employeeId) {
        return leaveRequestServiceImpl.getLeaveRequestsByEmployee(employeeId);
    }

    // additional endpoints
}