package com.example.demo;


import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import controller.FileController;

@SpringBootApplication 
@ComponentScan({"com.example.demo","Controller"})

public class FileuploadApplication {

	public static void main(String[] args) {
		new File(FileController.uploadDirectory).mkdir();
		SpringApplication.run(FileuploadApplication.class, args);
	}

}

    
         

