package xin.saul.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import xin.saul.demo.model.Employee;

import java.util.List;

@RestController(EmployeeController.EMPLOYEE)
public class EmployeeController {

    public static final String EMPLOYEES = "employees";
    public static final String EMPLOYEE = "employee";
    public static final String EMPLOYEE_ID = "employee/{id}";

    @PutMapping
    public void update(@RequestBody Employee employee) {
    }

    @DeleteMapping(EMPLOYEE_ID)
    public void deleteById(@PathVariable long id) {
    }

    @GetMapping(EMPLOYEE_ID)
    public Employee queryById(@PathVariable long id) {
        return null;
    }

    @PostMapping
    public void add(@RequestBody Employee employee) {
    }

    @GetMapping(EMPLOYEES)
    public ModelAndView queryAll(ModelAndView model) {
        return null;
    }
}
