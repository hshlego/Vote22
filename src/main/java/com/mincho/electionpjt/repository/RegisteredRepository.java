package com.mincho.electionpjt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mincho.electionpjt.domain.Registered;

public interface RegisteredRepository extends JpaRepository<Registered, Long>{
	boolean existsByRegid(String regid);
}