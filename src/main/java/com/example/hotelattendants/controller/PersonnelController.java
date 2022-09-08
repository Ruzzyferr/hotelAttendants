package com.example.hotelattendants.controller;

import com.example.hotelattendants.dto.PersonnelDTO;
import com.example.hotelattendants.dto.PersonnelSaveRequestDTO;
import com.example.hotelattendants.service.PersonnelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/personnel")
public class PersonnelController {

    private final PersonnelService personnelService;

    @PostMapping("/save")
    public ResponseEntity<PersonnelDTO> savePersonnel(@RequestBody PersonnelSaveRequestDTO personnelSaveRequestDTO) {
        return ResponseEntity.ok(personnelService.save(personnelSaveRequestDTO));
    }

}
