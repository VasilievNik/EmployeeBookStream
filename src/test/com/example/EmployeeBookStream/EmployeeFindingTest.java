package com.example.EmployeeBookStream;

import com.example.EmployeeBookStream.Employee;
import com.example.EmployeeBookStream.EmployeeService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeFindingTest {

    @Test
    public void getAllemployees(){
        Employee employee1 = new Employee("Len", "Harrison", 100, 1);
        Employee employee2 = new Employee("Gneg", "Johnson", 500, 2);
        Employee employee3 = new Employee("Saul", "Goodman", 1000, 3);

        EmployeeService employeeService = new EmployeeService() {
            @Override
            public Employee add(String fristName, String secondName, Integer salary, Integer id) {
                return null;
            }

            @Override
            public Employee add(Employee employee) {
                return null;
            }

            @Override
            public Employee remove(String fristName, String secondName, Integer salary, Integer id) {
                return null;
            }

            @Override
            public Employee remove(Employee employee) {
                return null;
            }

            @Override
            public Employee find(String fristName, String secondName, Integer salary, Integer id) {
                return null;
            }

            @Override
            public Employee find(Employee employee) {
                return null;
            }

            @Override
            public Collection<Employee> findAll() {
                return null;
            }
        };

        employeeService.add(employee1);
        employeeService.add(employee2);
        employeeService.add(employee3);

        List<Employee> expected = (List<Employee>) employeeService.findAll();
        List<Employee> actual = new ArrayList<Employee>();

        actual.add(employee1);
        actual.add(employee2);
        actual.add(employee3);

        Employee findEmployee1 = employeeService.find(employee2);
        Employee findEmployee2 = actual.get(1);

        assertEquals(findEmployee1, findEmployee2);

    }
}