package com.example.hotelattendants.service;

import com.example.hotelattendants.dto.JobsDTO;
import com.example.hotelattendants.dto.JobsSaveRequestDTO;
import com.example.hotelattendants.entity.Jobs;
import com.example.hotelattendants.mapper.JobsMapper;
import com.example.hotelattendants.repository.JobsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class JobsService {

    private final JobsMapper jobsMapper;

    private final JobsRepository jobsRepository;

    public JobsDTO save(JobsSaveRequestDTO dto){

        Jobs jobs = jobsMapper.toEntityFromSaveRequest(dto);
        jobsRepository.save(jobs);

        return jobsMapper.toDto(jobs);
    }

    public JobsDTO getById(int id) {
        Jobs jobs = jobsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Not Found!"));
        return jobsMapper.toDto(jobs);
    }

}
