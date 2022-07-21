package com.example.EmployeeBookStream;

import java.util.Objects;

public class Employee {
    private Integer salary;
    private Integer id;
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName, Integer salary, Integer id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.id = id;
    }

    public String toString(){
        return "Имя: "+firstName+"\nОтчество: "+lastName+"\n";
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Employee employee = (Employee) other;
        return firstName.equals(employee.firstName);
    }

    public int hashCode() {
        return Objects.hash(firstName)+Objects.hash(lastName);
    }

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public Integer getSalary(){
        return this.salary;
    }
    public void setSalary(Integer salary){
        this.salary = salary;
    }

    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

}