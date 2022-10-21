package com.example.hotelattendants.controller;

import com.example.hotelattendants.dto.PersonnelDTO;
import com.example.hotelattendants.dto.PersonnelSaveRequestDTO;
import com.example.hotelattendants.service.PersonnelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/personnel")
public class PersonnelController {

    private final PersonnelService personnelService;

    @PostMapping("/save")
    public ResponseEntity<PersonnelDTO> savePersonnel(@RequestBody PersonnelSaveRequestDTO personnelSaveRequestDTO) {
        return ResponseEntity.ok(personnelService.save(personnelSaveRequestDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<PersonnelDTO>> findAllByRoleAndAndJobs_Name(@PathVariable int id){
        return ResponseEntity.ok(personnelService.findAllByRoleAndAndJobs_Name(id));
    }
}
