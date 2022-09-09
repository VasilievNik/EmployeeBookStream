package com.example.EmployeeBookStream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepartmentServiceTests {

    @Test
    public void getAllemployees(){
        Employee employee1 = new Employee("Len", "Harrison", 100, 1);
        Employee employee2 = new Employee("Gneg", "Johnson", 500, 2);
        Employee employee3 = new Employee("Saul", "Goodman", 1000, 3);
        Employee employee4 = new Employee("Fill", "Sponsor", 10000, 2);

        DepartmentService departmentService = new DepartmentService() {
            @Override
            public List<Employee> getDepList(Integer departmentID) {
                return null;
            }

            @Override
            public Employee maxSalary(Integer departmentID) {
                return null;
            }

            @Override
            public Employee minSalary(Integer departmentID) {
                return null;
            }

            @Override
            public List<Employee> getAllDepList() {
                return null;
            }
        };


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
        employeeService.add(employee4);

        List<Employee> expectedDepartment = departmentService.getDepList(2);
        List<Employee> actual = new ArrayList<Employee>();

        actual.add(employee2);
        actual.add(employee4);

        assertEquals(expectedDepartment, actual); //Проверка вывода по департаменту

        Employee expectedMinSalary = departmentService.minSalary(2); //Проверка вывода по департаменту и мин зп
        assertEquals(expectedMinSalary, employee2);

        Employee expectedMaxSalary = departmentService.maxSalary(2); //Проверка вывода по департаменту и макс зп
        assertEquals(expectedMaxSalary, employee4);


        List<Employee> actual1 = new ArrayList<Employee>();
        actual1.add(employee1);
        actual1.add(employee2);
        actual1.add(employee3);
        actual1.add(employee4);
        assertEquals(actual1, departmentService.getAllDepList());
    }

}
