
package com.example.EmployeeBookStream;

import java.util.Collection;
import java.util.List;

public interface  DepartmentService {

    List<Employee> getDepList(Integer departmentID);

    Employee maxSalary(Integer departmentID);

    Employee minSalary(Integer departmentID);

    List<Employee> getAllDepList();
}

