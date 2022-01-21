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
    
    @GetMapping("/all/{candidate}")
    public List<SNSData> findByCandidate(@PathVariable("candidate") String candidate) {
		return snsDataRepository.findByCandidate(candidate, Sort.by(Sort.Direction.DESC, "id"));
    }
    
    @GetMapping("/limit30/{candidate}")
    public List<SNSData> findTop30ByCandidate(@PathVariable("candidate") String candidate) {
    	return snsDataRepository.findTop30ByCandidate(candidate, Sort.by(Sort.Direction.DESC, "id"));
    }
    
    @GetMapping("/limit15/{candidate}")
    public List<SNSData> findTop15ByCandidate(@PathVariable("candidate") String candidate) {
    	return snsDataRepository.findTop30ByCandidate(candidate, Sort.by(Sort.Direction.DESC, "id"));
    }
    
    @PostMapping("/post")
    public void postSNSData(@RequestBody SNSDataSaveRequestDto dto){
    	snsDataRepository.save(dto.toEntity());
    }
    
}
