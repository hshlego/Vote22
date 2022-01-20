package com.mincho.electionpjt.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SurveyResultSaveRequestDto {

    private String requester;
    private String executer;
    private String uploadMonth;
    private String uploadDay;
    private String url;
    private String c1;
    private String c2;
    private String c3;
    private String c4;

    public SurveyResult toEntity(){
        return SurveyResult.builder()
        		.requester(requester)
        		.executer(executer)
        		.uploadMonth(uploadMonth)
        		.uploadDay(uploadDay)
        		.url(url)
        		.c1(c1)
        		.c2(c2)
        		.c3(c3)
        		.c4(c4)
        		.build();
    }
}