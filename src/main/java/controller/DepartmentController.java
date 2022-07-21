package controller;

import com.example.EmployeeBookStream.Employee;
import com.example.EmployeeBookStream.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final EmployeeService employeeService;

    public DepartmentController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/max-salary")
    public Optional<Employee> maxSalary(@RequestParam Integer id){
        Collection<Employee> collection = (Collection<Employee>) employeeService;
        return collection.stream()
                .filter(employee -> Objects.equals(employee.getId(), id))
                .max(Comparator.comparingInt(Employee::getSalary));
    }

    @GetMapping("/min-salary")
    public Optional<Employee> minSalary(@RequestParam Integer id){
        Collection<Employee> collection = (Collection<Employee>) employeeService;
        return collection.stream()
                .filter(employee -> Objects.equals(employee.getId(), id))
                .min(Comparator.comparingInt(Employee::getSalary));
    }

    @GetMapping("/all")
    public Stream findEmployee(@RequestParam Integer id){
        Collection<Employee> collection = (Collection<Employee>) employeeService;
        return collection.stream()
                .filter(employee -> Objects.equals(employee.getId(), id));
    }

    @GetMapping("/all")
    public Stream findEmployee(){
        Collection<Employee> collection = (Collection<Employee>) employeeService;
        return collection.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary));
    }
}
