package com.example.EmployeeBookStream;

import org.apache.commons.lang3.StringUtils;
import controller.EmployeeController;

public abstract class EmployeeServiceTest {
    private final EmployeeService employeeService;

    Employee employee = new Employee("F", "L", 500, 1);


    public EmployeeServiceTest(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    addEmployee(); //Я просто не понимаю, как можно проверить эти функции...
}
