package com.mincho.electionpjt.web;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mincho.electionpjt.domain.SurveyResult;
import com.mincho.electionpjt.domain.SurveyResultRepository;
import com.mincho.electionpjt.domain.SurveyResultSaveRequestDto;

import lombok.AllArgsConstructor;

@RequestMapping("/survey")
@RestController
@AllArgsConstructor
public class SurveyResultRestController {

    private SurveyResultRepository surveyResultRepository;

    @GetMapping("/{id}")
    public Optional<SurveyResult> getSurveyResult(@PathVariable("id") Long id) {
    	return surveyResultRepository.findById(id);
    }
    
    @GetMapping("/all")
    public List<SurveyResult> getAllSurveyResult() {
        return surveyResultRepository.findAll();
    }
    

    @PostMapping("/post")
    public void savePosts(@RequestBody SurveyResultSaveRequestDto dto){
    	surveyResultRepository.save(dto.toEntity());
    }
}
