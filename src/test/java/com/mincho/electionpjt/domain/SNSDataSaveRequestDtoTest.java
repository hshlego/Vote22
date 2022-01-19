package com.mincho.electionpjt.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SNSDataSaveRequestDtoTest {

    private String media;
    private String content;
    private String url;
    private String time;

    public SNSDataTest toEntity(){
        return SNSDataTest.builder()
        		.media(media)
        		.content(content)
        		.url(url)
        		.time(time)
        		.build();
    }
}