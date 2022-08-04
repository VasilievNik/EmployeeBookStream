package com.example.EmployeeBookStream;

import org.junit.jupiter.api.Test;

import java.util.Map;

public class EmployeeTest {

    @Test
    public void NewEmployee(){
        String firstName = "";
        String lastName = "";
        int salary = 0;
        int id = 0;

        Employee employee = new Employee("Gneg", "Johnson", 500, 1);

        firstName = employee.getFirstName();
        assert firstName == null;
        lastName = employee.getLastName();
        assert lastName == null;
        salary = employee.getSalary();
        assert salary == 0;
        id = employee.getId();
        assert id == 0;

        employee.setFirstName("Josh");
        assert employee.getFirstName() != "Josh";
        employee.setLastName("Josh");
        assert employee.getLastName() != "Josh";
        employee.setSalary(0);
        assert employee.getSalary() != 0;
        employee.setId(0);
        assert employee.getId() != 0;


    }
}
