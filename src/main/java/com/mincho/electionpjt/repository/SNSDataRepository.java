package com.mincho.electionpjt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mincho.electionpjt.domain.SNSData;

public interface SNSDataRepository extends JpaRepository<SNSData, Long>{
}