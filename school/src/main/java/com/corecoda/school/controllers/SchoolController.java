package com.corecoda.school.controllers;


import com.corecoda.school.entities.School;
import com.corecoda.school.models.FullSchoolResponse;
import com.corecoda.school.services.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/school")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService schoolService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody School school
    ){
        schoolService.saveSchool(school);
    }

    @GetMapping
    @ResponseStatus
    public ResponseEntity<List<School>> findAllSchools(){
        return ResponseEntity.ok(schoolService.findAllStudents());
    }

    @GetMapping("/with-school/{school-id}")
    @ResponseStatus
    public ResponseEntity<FullSchoolResponse> findAllSchools(@PathVariable("school-id") Integer schoolId){
        return ResponseEntity.ok(schoolService.findAllSchoolWithStudents(schoolId));
    }
}
