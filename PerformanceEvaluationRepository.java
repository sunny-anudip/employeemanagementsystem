package com.employeemanagement.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemanagement.system.entity.PerformanceEvaluation;

public interface PerformanceEvaluationRepository extends JpaRepository<PerformanceEvaluation, Long>
{

}
