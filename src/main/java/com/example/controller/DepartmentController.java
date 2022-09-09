package controller;

import com.example.EmployeeBookStream.Employee;
import com.example.EmployeeBookStream.EmployeeService;
import com.example.EmployeeBookStream.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/find")
    public List<Employee> find(@RequestParam Integer id){
        return departmentService.getDepList(id);
    }

    @GetMapping("/max-salary")
    public Employee maxSalary(@RequestParam Integer id){
        return departmentService.maxSalary(id);
    }

    @GetMapping("/min-salary")
    public Employee minSalary(@RequestParam Integer id){
        return departmentService.minSalary(id);
    }

    @GetMapping("/all")
    public List<Employee> findAll(){
        return departmentService.getAllDepList();
    }
}
