package com.mincho.electionpjt.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SNSDataSaveRequestDto {

    private String media;
    private String content;
    private String url;
    private String upload;
    private String candidate;

    public SNSData toEntity(){
        return SNSData.builder()
        		.media(media)
        		.content(content)
        		.url(url)
        		.upload(upload)
        		.candidate(candidate)
        		.build();
    }
}