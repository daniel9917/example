package com.perficient.demo.mapper;

import com.perficient.demo.domain.Salary;
import com.perficient.demo.model.SalaryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface SalaryMapper {
    SalaryDTO salaryToSalaryDTO (Salary salary);



    Salary salaryDTOToSalary(SalaryDTO salaryDTO);

    void updateSalaryFromDTO (SalaryDTO salaryDTO, @MappingTarget Salary salary);
}
