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
    private String month;
    private String day;
    private String url;
    private String c1;
    private String c2;
    private String c3;
    private String c4;

    public SurveyResult toEntity(){
        return SurveyResult.builder()
        		.requester(requester)
        		.executer(executer)
        		.month(month)
        		.day(day)
        		.url(url)
        		.c1(c1)
        		.c2(c2)
        		.c3(c3)
        		.c4(c4)
        		.build();
    }
}