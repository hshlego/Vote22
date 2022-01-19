package com.mincho.electionpjt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mincho.electionpjt.domain.SurveyResult;

public interface SurveyResultRepository extends JpaRepository<SurveyResult, Long>{
}