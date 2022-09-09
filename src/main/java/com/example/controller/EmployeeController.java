package controller;

import com.example.EmployeeBookStream.Employee;
import com.example.EmployeeBookStream.EmployeeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String firstName, @RequestParam String lastName, @RequestParam Integer salary, @RequestParam Integer id){
        return employeeService.add(StringUtils.capitalize(firstName), StringUtils.capitalize(lastName), salary, id);
    }

    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam String firstName, @RequestParam String lastName, @RequestParam Integer salary, @RequestParam Integer id){
        return employeeService.remove(StringUtils.capitalize(firstName), StringUtils.capitalize(lastName), salary, id);
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam String firstName, @RequestParam String lastName, @RequestParam Integer salary, @RequestParam Integer id){
        return employeeService.find(StringUtils.capitalize(firstName), StringUtils.capitalize(lastName), salary, id);
    }

    @GetMapping
    public Collection<Employee> findAll(){
        return employeeService.findAll();
    }
}
