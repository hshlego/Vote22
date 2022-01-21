package com.mincho.electionpjt.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mincho.electionpjt.domain.SNSData;

public interface SNSDataRepository extends JpaRepository<SNSData, Long>{
	List<SNSData> findByCandidate(String candidate, Sort sort);
	List<SNSData> findTop30ByCandidate(String candidate, Sort sort);
	List<SNSData> findTop15ByCandidate(String candidate, Sort sort);
}