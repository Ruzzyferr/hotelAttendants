package com.example.hotelattendants.repository;

import com.example.hotelattendants.entity.Jobs;
import com.example.hotelattendants.entity.Personnel;
import com.example.hotelattendants.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonnelRepository extends JpaRepository<Personnel, Integer> {

    List<Personnel> findAllByRoleAndAndJobs_Name(String role, Jobs jobs);
    Personnel findById(int id);

}
