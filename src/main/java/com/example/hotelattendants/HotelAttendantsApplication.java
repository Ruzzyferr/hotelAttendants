package com.example.hotelattendants;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HotelAttendantsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelAttendantsApplication.class, args);
    }

}
