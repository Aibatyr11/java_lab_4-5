package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;

@SpringBootApplication
public class Demo11Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo11Application.class, args);

        DbFunctions dbFunctions = new DbFunctions();

        Connection conn = dbFunctions.connectToDb("lab5", "postgres", "aki180504");

        if (conn != null) {
            System.out.println("Connection to the database was successful.");
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}
