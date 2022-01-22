package com.mincho.electionpjt.web;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mincho.electionpjt.domain.Registered;
import com.mincho.electionpjt.domain.RegisteredSaveRequestDto;
import com.mincho.electionpjt.repository.RegisteredRepository;

import lombok.AllArgsConstructor;

@RequestMapping("/registered")
@RestController
@AllArgsConstructor
public class RegisteredRestController {

    private RegisteredRepository registeredRepository;

    @GetMapping("/{id}")
    public Optional<Registered> getRegisteredById(@PathVariable("id") Long id) {
    	return registeredRepository.findById(id);
    }
    
    @GetMapping("/all")
    public List<Registered> getAllRegistered() {
        return registeredRepository.findAll();
    }
    
    @PostMapping("/post")
    public void postRegistered(@RequestBody RegisteredSaveRequestDto dto) {
    	if(registeredRepository.existsByRegid(dto.getRegid())) return;
    	registeredRepository.save(dto.toEntity());
    }
    
}
