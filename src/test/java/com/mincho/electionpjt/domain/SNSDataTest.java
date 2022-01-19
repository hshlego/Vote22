package com.mincho.electionpjt.domain;

import javax.persistence.Column;
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
public class SNSDataTest {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String media;
	
	@Column(columnDefinition = "Text")
	private String content;
	private String url;
	private String time;
	
	@Builder
    public SNSDataTest(String media, String content, String url, String time) {
		this.media = media;
		this.content = content;
		this.url = url;
		this.time = time;
    }
}
