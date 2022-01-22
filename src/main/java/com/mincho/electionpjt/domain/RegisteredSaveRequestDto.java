package com.mincho.electionpjt.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RegisteredSaveRequestDto {

    private String regid;

    public Registered toEntity(){
        return Registered.builder()
        		.regid(regid)
        		.build();
    }
}