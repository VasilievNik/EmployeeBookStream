package com.example.EmployeeBookStream;

import java.util.Collection;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {

    private final Map<Integer, Employee> employeeMap;

    public EmployeeServiceImpl(Map<Integer, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }


    @Override
    public Employee add(String fristName, String secondName, Integer salary, Integer id) {
        Employee employee = new Employee(fristName, secondName, salary, id);
        if (employeeMap.containsValue(employee)){
            throw new EmployeeAlreadyAddedException();
        }
        employeeMap.put(employee.hashCode(), employee);
        return employee;
    }

    @Override
    public Employee remove(String fristName, String secondName, Integer salary, Integer id) {
        Employee employee = new Employee(fristName, secondName, salary, id);
        if (employeeMap.containsValue(employee)){
            employeeMap.remove(employee);
            return employee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Employee find(String fristName, String secondName, Integer salary, Integer id) {
        Employee employee = new Employee(fristName, secondName, salary, id);
        if (employeeMap.containsValue(employee)){
            return employeeMap.get(employee.hashCode());
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Collection<Employee> findAll() {
        return employeeMap.values();
    }
}
