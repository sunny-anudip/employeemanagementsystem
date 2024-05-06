package com.employeemanagement.system.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LeaveRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long employeeId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String reason;
    private String status; // APPROVED, REJECTED, PENDING

    
}