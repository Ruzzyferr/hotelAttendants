package com.example.hotelattendants.service;

import com.example.hotelattendants.dto.PersonnelDTO;
import com.example.hotelattendants.dto.PersonnelSaveRequestDTO;
import com.example.hotelattendants.entity.Jobs;
import com.example.hotelattendants.entity.Personnel;
import com.example.hotelattendants.mapper.PersonnelMapper;
import com.example.hotelattendants.repository.PersonnelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PersonnelService {

    private final PersonnelMapper personnelMapper;
    private final PersonnelRepository personnelRepository;

    public PersonnelDTO save(PersonnelSaveRequestDTO dto){

        Personnel personnel = personnelMapper.toEntityFromSaveRequestDto(dto);
        personnelRepository.save(personnel);

        return personnelMapper.toDto(personnel);
    }

    public List<PersonnelDTO> findAllByRoleAndAndJobs_Name(int id){
        Personnel personnel = personnelRepository.findById(id);

        return personnelMapper.toDtoListFromEntityList(
                personnelRepository.findAllByRoleAndAndJobs_Name("ATTENDANT",personnel.getJobs()));
    }



}
