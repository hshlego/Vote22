package com.mincho.electionpjt.web;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mincho.electionpjt.domain.VideoData;
import com.mincho.electionpjt.domain.VideoDataRepository;
import com.mincho.electionpjt.domain.VideoDataSaveRequestDto;

import lombok.AllArgsConstructor;

@RequestMapping("/video")
@RestController
@AllArgsConstructor
public class VideoDataRestController {

    private VideoDataRepository videoDataRepository;

    @GetMapping("/{id}")
    public Optional<VideoData> getVideoData(@PathVariable("id") Long id) {
    	return videoDataRepository.findById(id);
    }
    
    
    @GetMapping("/all")
    public List<VideoData> getAllVideoData() {
        return videoDataRepository.findAll();
    }
    

    @PostMapping("/post")
    public void savePosts(@RequestBody VideoDataSaveRequestDto dto){
    	videoDataRepository.save(dto.toEntity());
    }
}
