package com.example2.Schools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class SchoolController {

    private SchoolService schoolService;
    @Autowired
    public SchoolController(SchoolService schoolService){
        this.schoolService=schoolService;
    }
    @PostMapping("/saveschool")
    public Mono<School> saveallrecord(@RequestBody School school){
        return schoolService.saveRecord(school);
    }

    @GetMapping("/school")
    public Flux<School> findallrecord(){
        return schoolService.findallrecord();
    }

    @GetMapping("/school/{id}")

    public Mono<School> getByid(@PathVariable("id") String school_id){
        Mono<School> uni = schoolService.getById(school_id);
        return uni;
    }
}
