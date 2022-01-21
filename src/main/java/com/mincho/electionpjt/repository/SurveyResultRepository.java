package com.mincho.electionpjt.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mincho.electionpjt.domain.SurveyResult;

public interface SurveyResultRepository extends JpaRepository<SurveyResult, Long>{
	List<SurveyResult> findAll(Sort sort);
	List<SurveyResult> findTop15By(Sort sort);
	List<SurveyResult> findTop10By(Sort sort);
}