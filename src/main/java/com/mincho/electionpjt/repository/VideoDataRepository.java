package com.mincho.electionpjt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mincho.electionpjt.domain.VideoData;

public interface VideoDataRepository extends JpaRepository<VideoData, Long>{
}