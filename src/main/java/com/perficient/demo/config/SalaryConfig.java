package com.perficient.demo.config;

import com.perficient.demo.mapper.SalaryMapper;
import com.perficient.demo.mapper.SalaryMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SalaryConfig {

    @Bean
    public SalaryMapper salaryMapper() {
        return new SalaryMapperImpl();
    }

}
