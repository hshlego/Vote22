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
@Table(name="surveyresult")
public class SurveyResult {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	private String requester;
	private String executer;
	private String uploadMonth;
	private String uploadDay;
	private String url;
	private String c1, c2, c3, c4;
	
	@Builder
    public SurveyResult(String requester, String executer, String uploadMonth, String uploadDay, String url, String c1, String c2, String c3, String c4) {
		this.requester = requester;
		this.executer = executer;
		this.uploadMonth = uploadMonth;
		this.uploadDay = uploadDay;
		this.url = url;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
    }
}
