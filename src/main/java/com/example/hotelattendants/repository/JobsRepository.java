package com.example.hotelattendants.repository;

import com.example.hotelattendants.entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobsRepository extends JpaRepository<Jobs,Integer> {

}
