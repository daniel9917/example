package com.perficient.demo;

import com.perficient.demo.mapper.SalaryMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {
			"com.example.demo.mapper",
			"com.example.demo.controller",
			"com.example.demo.service",
			"com.example.demo.repository",
		}, scanBasePackageClasses = {
			SalaryMapper.class
		}
)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
