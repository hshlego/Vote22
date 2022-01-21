package com.mincho.electionpjt.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name="videodata")
public class VideoData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String title;
	private String thumbnail;
	private String runtime;
	private String upload;//uploaded date
	private String candidate;
	
	@Builder
    public VideoData(String title, String thumbnail, String runtime, String upload, String candidate) {
		this.title = title;
		this.thumbnail = thumbnail;
		this.runtime = runtime;
		this.upload = upload;
		this.candidate = candidate;
	}
}
