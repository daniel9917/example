package com.perficient.demo.controller;

import com.perficient.demo.domain.Salary;
import com.perficient.demo.model.SalaryDTO;
import com.perficient.demo.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/salary")
public class SalaryController {

    @Autowired
    private SalaryService salaryService;

    @GetMapping("/hello-world")
    public String hello () {
        LocalDateTime time = LocalDateTime.now();
        return "Hello World, it's the "  + time.getMonth().name() + " of " + time.getDayOfMonth();
    }

    @GetMapping("/all")
    public List<Salary> getAll () {
        return salaryService.getAll();
    }

    @PostMapping
    public Salary create (@RequestBody @Valid SalaryDTO salaryDTO) {
        return salaryService.create(salaryDTO);
    }

    @GetMapping("/{salaryId}")
    public Salary getById (@PathVariable UUID salaryId) {
        return salaryService.getById(salaryId);
    }

    @DeleteMapping("/{salaryId}")
    public Salary delete (@PathVariable UUID salaryId) {
        return salaryService.delete(salaryId);
    }
}
