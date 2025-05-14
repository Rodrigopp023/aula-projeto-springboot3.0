package com.myproject.course.services;

import com.myproject.course.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    @Autowired
    private TaxService taxService;

    @Autowired
    private PensionService pensionService;

    public double netSalary(Employee employee) {
        return employee.getGrossSale() - taxService.tax(employee.getGrossSale())
                - pensionService.discount(employee.getGrossSale());
    }
}
