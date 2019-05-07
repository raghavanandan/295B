package com.mark.controller;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SparkApp {

	public static void main(String[] args) {
    	Logger.getLogger("org").setLevel(Level.OFF);

		SpringApplication.run(SparkApp.class, args);
	}
}
				