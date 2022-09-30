package com.example.hotelattendants.service;

import com.example.hotelattendants.dto.JobsDTO;
import com.example.hotelattendants.dto.JobsSaveRequestDTO;
import com.example.hotelattendants.entity.Jobs;
import com.example.hotelattendants.mapper.JobsMapper;
import com.example.hotelattendants.repository.JobsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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

}
