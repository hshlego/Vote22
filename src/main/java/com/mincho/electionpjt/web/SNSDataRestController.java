package com.mincho.electionpjt.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mincho.electionpjt.domain.SNSData;
import com.mincho.electionpjt.domain.SNSDataSaveRequestDto;
import com.mincho.electionpjt.repository.SNSDataRepository;

import lombok.AllArgsConstructor;

@RequestMapping("/sns")
@RestController
@AllArgsConstructor
public class SNSDataRestController {

    private SNSDataRepository snsDataRepository;

    @GetMapping("/{id}")
    public Optional<SNSData> getSNSData(@PathVariable("id") Long id) {
    	return snsDataRepository.findById(id);
    }
    
    @GetMapping("/all")
    public List<SNSData> getAllSNSData() {
        return snsDataRepository.findAll();
    }
    

    @PostMapping("/post")
    public void postSNSData(@RequestBody SNSDataSaveRequestDto dto){
    	snsDataRepository.save(dto.toEntity());
    }
    
    @GetMapping("/test")
    public ArrayList<SNSData> getTesting() {
    	return new ArrayList(Arrays.asList(
    			new SNSData("1", "1", "1", "1"),
    			new SNSData("1", "1", "1", "1"),
    			new SNSData("1", "1", "1", "1"),
    			new SNSData("1", "1", "1", "1")    			
    			));
    }
}
