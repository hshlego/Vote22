package com.mincho.electionpjt.web;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mincho.electionpjt.domain.SNSData;
import com.mincho.electionpjt.domain.SNSDataRepositoryTest;
import com.mincho.electionpjt.domain.SNSDataSaveRequestDto;

import lombok.AllArgsConstructor;

@RequestMapping("/sns")
@RestController
@AllArgsConstructor
public class SNSDataRestControllerTest {

    private SNSDataRepositoryTest snsDataRepositoryTest;

    @GetMapping("/{id}")
    public Optional<SNSData> getSNSData(@PathVariable("id") Long id) {
    	return snsDataRepositoryTest.findById(id);
    }
    
    @GetMapping("/all")
    public List<SNSData> getAllSNSData() {
        return snsDataRepositoryTest.findAll();
    }
    

    @PostMapping("/post")
    public void postSNSData(@RequestBody SNSDataSaveRequestDto dto){
    	snsDataRepositoryTest.save(dto.toEntity());
    }
}
