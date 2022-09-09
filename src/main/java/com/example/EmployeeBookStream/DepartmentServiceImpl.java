package com.example.EmployeeBookStream;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    private final EmployeeService employeeService;

    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public List<Employee> getDepList(Integer departmentID) {
        List<Employee> employeeByDepartment = (List<Employee>) employeeService.findAll();
        if (departmentID == null) {
            throw new IllegalArgumentException();
        }
        return employeeByDepartment.stream()
                .filter(employee -> employee.getId().equals(departmentID))
                .collect(Collectors.toList());
    }

    @Override
    public Employee maxSalary(Integer departmentID) {
        List<Employee> salary = (List<Employee>) employeeService.findAll();
        return salary.stream()
                .filter(employee -> employee.getId().equals(departmentID))
                .max(Comparator.comparingInt(Employee::getSalary)).get();
    }

    @Override
    public Employee minSalary(Integer departmentID) {
        List<Employee> salary = (List<Employee>) employeeService.findAll();
        return salary.stream()
                .filter(employee -> employee.getId().equals(departmentID))
                .min(Comparator.comparingInt(Employee::getSalary)).get();
    }

    @Override
    public List<Employee> getAllDepList() {
        List<Employee> allEmployees = (List<Employee>) employeeService.findAll();
        allEmployees = allEmployees.stream()
                .sorted(Comparator.comparingInt(Employee::getId))
                .collect(Collectors.toList());
        return allEmployees;
    }
}
