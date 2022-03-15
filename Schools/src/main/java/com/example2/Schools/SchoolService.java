package com.example2.Schools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SchoolService {
    private SchoolRepository schoolRepository;

    @Autowired
    public SchoolService(SchoolRepository schoolRepository){
        this.schoolRepository=schoolRepository;
    }
    public Mono<School> saveRecord(School school){

        return schoolRepository.save(school);

    }
    public Flux<School> findallrecord(){
        return schoolRepository.findAll().switchIfEmpty(Flux.empty());
    }

    public Mono<School> getById(String school_id){
        return schoolRepository.findById(school_id).switchIfEmpty(Mono.empty());
    }

}
