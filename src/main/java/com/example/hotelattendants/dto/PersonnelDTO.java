package com.example.hotelattendants.dto;

import com.example.hotelattendants.entity.Jobs;
import com.example.hotelattendants.enums.Role;
import lombok.Data;


@Data
public class PersonnelDTO {

    private int id;

    private String name;

    private String surname;

    private Jobs jobs;

    private Role role;

}
