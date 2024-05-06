package com.employeemanagement.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.system.entity.PerformanceEvaluation;
import com.employeemanagement.system.serviceimpl.PerformanceEvaluationServiceImpl;
import com.employeemanagement.system.services.PerformanceEvaluationService;

@RestController
@RequestMapping("/api/evaluation")
public class PerformanceEvaluationController {
    @Autowired
    private PerformanceEvaluationServiceImpl performanceEvaluationServiceImpl;

    @PostMapping("/conduct")
    public PerformanceEvaluation conductEvaluation(@RequestBody PerformanceEvaluation evaluation) {
        return performanceEvaluationServiceImpl.conductEvaluation(evaluation);
    }

    @GetMapping("/employee/{employeeId}")
    public List<PerformanceEvaluation> getEvaluationsByEmployee(@PathVariable Long employeeId) {
        return performanceEvaluationServiceImpl.getEvaluationsByEmployee(employeeId);
    }

    // additional endpoints
}
