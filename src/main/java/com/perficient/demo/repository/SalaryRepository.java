package com.perficient.demo.repository;

import com.perficient.demo.domain.Salary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class SalaryRepository {

    private static final Logger LOG = LoggerFactory.getLogger(SalaryRepository.class);

    private static Map <UUID, Salary> salaryMap = new HashMap ();

    public List<Salary> getAll () {
        LOG.info("Retrieving all salaries in memory.");
        return salaryMap.entrySet().stream()
                .filter(uuidSalaryEntry -> uuidSalaryEntry.getValue().isDeleted() ? false : true)
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    public Optional <Salary> getById (UUID uuid) {
        LOG.info("Retrieving salary with id " + uuid);
        return salaryMap.entrySet().stream()
                .filter(uuidSalaryEntry -> (
                        uuidSalaryEntry.getValue().getId().equals(uuid) &&
                        !uuidSalaryEntry.getValue().isDeleted())
                        ? true : false)
                .map(Map.Entry::getValue)
                .findFirst();
    }

    public Salary save (Salary salary) {
        LOG.info("Saving salary in " + salary + ", memory.");
        salaryMap.put(salary.getId(), salary);
        return salary;
    }

    public Salary delete (Salary salary) {
        salary.setDeleted(true);
        LOG.info("Marking salary " + salary + ", deleted in memory.");
        salaryMap.put(salary.getId(), salary);
        return salary;
    }

}
