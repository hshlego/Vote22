package com.mincho.electionpjt.web;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mincho.electionpjt.domain.SurveyResult;
import com.mincho.electionpjt.domain.SurveyResultSaveRequestDto;
import com.mincho.electionpjt.repository.SurveyResultRepository;

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
        return surveyResultRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }
    
    @GetMapping("/limit10")
    public List<SurveyResult> getTop10() {
        return surveyResultRepository.findTop10(Sort.by(Sort.Direction.DESC, "id"));
    }
    
    @GetMapping("/limit15")
    public List<SurveyResult> getTop15() {
        return surveyResultRepository.findTop15(Sort.by(Sort.Direction.DESC, "id"));
    }

    @PostMapping("/post")
    public void savePosts(@RequestBody SurveyResultSaveRequestDto dto){
    	surveyResultRepository.save(dto.toEntity());
    }
}
