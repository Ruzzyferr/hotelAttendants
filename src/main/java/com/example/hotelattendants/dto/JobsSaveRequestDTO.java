package com.example.hotelattendants.dto;

import lombok.Data;

@Data
public class JobsSaveRequestDTO {

    private int id;

    private String name;

    private PersonnelNameDTO manager;

}
