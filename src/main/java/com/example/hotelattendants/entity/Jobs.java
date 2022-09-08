package com.example.hotelattendants.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "jobs")
@EqualsAndHashCode(of = "id")
public class Jobs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private Boolean isActive;

    @OneToOne
    @JoinColumn(name = "manager_id")
    private Personnel manager;

}
