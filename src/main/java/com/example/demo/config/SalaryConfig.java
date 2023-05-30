package com.example.demo.config;

import com.example.demo.mapper.SalaryMapper;
import com.example.demo.mapper.SalaryMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SalaryConfig {

    @Bean
    public SalaryMapper salaryMapper() {
        return new SalaryMapperImpl();
    }

}
