package com.example.hotelattendants.entity;

import com.example.hotelattendants.enums.Role;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "personnel")
@EqualsAndHashCode(of = "id")
public class Personnel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String surname;

    @ManyToOne
    private Jobs jobs;

    @Enumerated(EnumType.STRING)
    private Role role;

}
