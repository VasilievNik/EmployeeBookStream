package com.example.EmployeeBookStream;

import java.util.Collection;

public interface EmployeeService {

    Employee add(String fristName, String secondName, Integer salary, Integer id);

    Employee remove(String fristName, String secondName, Integer salary, Integer id);

    Employee find(String fristName, String secondName, Integer salary, Integer id);

    Collection<Employee> findAll();
}
