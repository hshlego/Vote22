package com.mincho.electionpjt.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VideoDataSaveRequestDto {

    private String name;
    private String url;
    private String date;
    private String views;
    private String runtime;

    public VideoData toEntity(){
        return VideoData.builder()
        		.name(name)
        		.url(url)
        		.date(date)
        		.views(views)
        		.runtime(runtime)
        		.build();
    }
}