package com.example.hotelattendants.controller;

import com.example.hotelattendants.dto.JobsDTO;
import com.example.hotelattendants.dto.JobsSaveRequestDTO;
import com.example.hotelattendants.entity.Jobs;
import com.example.hotelattendants.service.JobsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/jobs")
public class JobsController {

    private final JobsService jobsService;

    @PostMapping("/save")
    public ResponseEntity<JobsDTO> saveJobs(@RequestBody JobsSaveRequestDTO jobsSaveRequestDTO){

        return ResponseEntity.ok(jobsService.save(jobsSaveRequestDTO));

    }

}
