package com.example.hotelattendants.mapper;

import com.example.hotelattendants.dto.JobsDTO;
import com.example.hotelattendants.dto.JobsSaveRequestDTO;
import com.example.hotelattendants.entity.Jobs;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface JobsMapper {

    Jobs toEntity(JobsDTO dto);

    JobsDTO toDto(Jobs entity);

    Jobs toEntityFromSaveRequest(JobsSaveRequestDTO dto);

}
