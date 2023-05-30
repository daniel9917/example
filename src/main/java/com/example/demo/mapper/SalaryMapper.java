package com.example.demo.mapper;

import com.example.demo.domain.Salary;
import com.example.demo.model.SalaryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface SalaryMapper {
    SalaryDTO salaryToSalaryDTO (Salary salary);



    Salary salaryDTOToSalary(SalaryDTO salaryDTO);

    void updateSalaryFromDTO (SalaryDTO salaryDTO, @MappingTarget Salary salary);
}
