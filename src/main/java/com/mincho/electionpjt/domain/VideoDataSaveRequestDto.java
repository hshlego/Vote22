package com.mincho.electionpjt.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VideoDataSaveRequestDto {

	private String title;
	private String thumbnail;
	private String runtime;
	private String upload;//uploaded date
	private String candidate;
	
    public VideoData toEntity(){
        return VideoData.builder()
        		.title(title)
        		.thumbnail(thumbnail)
        		.runtime(runtime)
        		.upload(upload)
        		.candidate(candidate)
        		.build();
    }
}