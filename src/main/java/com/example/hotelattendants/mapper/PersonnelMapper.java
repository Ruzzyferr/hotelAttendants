package com.example.hotelattendants.mapper;

import com.example.hotelattendants.dto.PersonnelDTO;
import com.example.hotelattendants.dto.PersonnelSaveRequestDTO;
import com.example.hotelattendants.entity.Personnel;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonnelMapper {

    Personnel toEntity(PersonnelDTO dto);
    @Named("toDto")
    PersonnelDTO toDto(Personnel entity);

    Personnel toEntityFromSaveRequestDto(PersonnelSaveRequestDTO dto);
    @IterableMapping(qualifiedByName = "toDto")
    List<PersonnelDTO> toDtoListFromEntityList(List<Personnel> personnelList);


}
