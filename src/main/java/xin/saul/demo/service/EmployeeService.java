package xin.saul.demo.service;

import org.springframework.web.servlet.ModelAndView;
import xin.saul.demo.model.Employee;

import java.util.List;

public interface EmployeeService {
    public void update(Employee employee);
    public void deleteById(long id);
    public Employee queryById(long id);
    public void add(Employee employee);
    ModelAndView queryAll(ModelAndView model);
}
