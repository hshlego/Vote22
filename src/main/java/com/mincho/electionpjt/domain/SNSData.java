package com.mincho.electionpjt.domain;

import javax.persistence.Column;
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
@Table(name = "snsdata")
public class SNSData {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String media;
	@Column(columnDefinition = "Text")
	private String content;
	private String url;
	private String upload;
	private String candidate;
	
	@Builder
    public SNSData(String media, String content, String url, String upload, String candidate) {
		this.media = media;
		this.content = content;
		this.url = url;
		this.upload = upload;
		this.candidate = candidate;
    }
}
