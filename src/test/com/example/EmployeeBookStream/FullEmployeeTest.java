package com.example.EmployeeBookStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class FullEmployeeTest {

    List<Employee> expected = new ArrayList<Employee>();

    Employee employee1 = new Employee("Len", "Harrison", 100, 1);
    Employee employee2 = new Employee("Gneg", "Johnson", 500, 2);
    Employee employee3 = new Employee("Saul", "Goodman", 1000, 3);

    @Mock
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

    @BeforeEach
    public void setUp(){
        EmployeeService employeeService = this.employeeService;
        employeeService.add(employee1);
        employeeService.add(employee2);
        employeeService.add(employee3);

        expected.add(employee1);
        expected.add(employee2);
        expected.add(employee3);
    }

    @Test
    public void addTest(){
        employeeService.remove(employee2);
        List<Employee> actual = (List<Employee>) employeeService.findAll();
        assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        List<Employee> actual = (List<Employee>) employeeService.findAll();
        expected.remove(1);
        assertEquals(expected, actual);
    }

    @Test
    public void findTest(){
        List<Employee> actual = (List<Employee>) employeeService.findAll();
        assertEquals(expected.get(0), actual.get(0));
    }



}
