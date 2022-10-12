package com.example.hotelattendants.dto;

import com.example.hotelattendants.entity.Jobs;
import lombok.Data;

@Data
public class PersonnelSaveRequestDTO {

    private int id;

    private String name;

    private String surname;

    private Jobs jobs;

    private String role;

}
