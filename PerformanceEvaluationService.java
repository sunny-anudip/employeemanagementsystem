package com.employeemanagement.system.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employeemanagement.system.entity.PerformanceEvaluation;

@Service
public interface PerformanceEvaluationService
{
	 public PerformanceEvaluation conductEvaluation(PerformanceEvaluation evaluation);

	    public List<PerformanceEvaluation> getEvaluationsByEmployee(Long employeeId);
	   
}
