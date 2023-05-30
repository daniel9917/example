package com.perficient.demo.service;

import com.perficient.demo.domain.Salary;
import com.perficient.demo.mapper.SalaryMapper;
import com.perficient.demo.model.SalaryDTO;
import com.perficient.demo.repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SalaryService {

    private final SalaryRepository salaryRepository;

    @Autowired
    private SalaryMapper salaryMapper;

    @Autowired
    public SalaryService(SalaryRepository salaryRepository) {
        this.salaryRepository = salaryRepository;
    }

    public Salary getById (UUID salaryId) {
        return salaryRepository.getById(salaryId).orElseThrow();
    }

    public Salary create (SalaryDTO salaryDTO) {
        salaryDTO.setId(UUID.randomUUID());
        salaryDTO.setDeleted(false);
        Salary entity = salaryMapper.salaryDTOToSalary(salaryDTO);
        return salaryRepository.save(entity);
    }

    public Salary update() {
        return null;
    }

    public List<Salary> getAll () {
        return salaryRepository.getAll();
    }

    public Salary delete (UUID salaryId) {
        Salary entity = salaryRepository.getById(salaryId).orElseThrow();
        return salaryRepository.delete(entity);
    }
}
