package com.mincho.electionpjt.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mincho.electionpjt.domain.VideoData;

public interface VideoDataRepository extends JpaRepository<VideoData, Long>{
	List<VideoData> findByCandidate(String candidate, Sort sort);
	List<VideoData> findTop15ByCandidate(String candidate, Sort sort);
	List<VideoData> findTop30ByCandidate(String candidate, Sort sort);
}