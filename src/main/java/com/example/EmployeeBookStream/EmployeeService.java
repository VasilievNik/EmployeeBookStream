package com.example.EmployeeBookStream;

import java.util.Collection;

public interface  EmployeeService {

    Employee add(String fristName, String secondName, Integer salary, Integer id);

    Employee add(Employee employee);

    Employee remove(String fristName, String secondName, Integer salary, Integer id);

    Employee remove(Employee employee);

    Employee find(String fristName, String secondName, Integer salary, Integer id);

    Employee find(Employee employee);

    Collection<Employee> findAll();
}
