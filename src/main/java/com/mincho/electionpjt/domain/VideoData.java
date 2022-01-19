package com.mincho.electionpjt.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class VideoData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String name;
	private String url;
	private String date;
	private String views;
	private String runtime; 
	
	@Builder
    public VideoData(String name, String url, String date, String views, String runtime) {
		this.name = name;
		this.url = url;
		this.date = date;
		this.views = views;
		this.runtime = runtime;
    }
}
