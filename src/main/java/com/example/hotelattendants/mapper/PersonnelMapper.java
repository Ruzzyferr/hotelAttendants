package com.example.hotelattendants.mapper;

import com.example.hotelattendants.dto.PersonnelDTO;
import com.example.hotelattendants.dto.PersonnelSaveRequestDTO;
import com.example.hotelattendants.entity.Personnel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonnelMapper {

    Personnel toEntity(PersonnelDTO dto);

    PersonnelDTO toDto(Personnel entity);

    Personnel toEntityFromSaveRequestDto(PersonnelSaveRequestDTO dto);


}
