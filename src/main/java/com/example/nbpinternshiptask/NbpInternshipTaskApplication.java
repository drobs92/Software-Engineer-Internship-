package com.example.nbpinternshiptask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })//temporary exclude
public class NbpInternshipTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(NbpInternshipTaskApplication.class, args);
    }

}
