package xin.saul.demo.dao;

import org.springframework.stereotype.Component;
import xin.saul.demo.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

    private HashMap<Long, Employee> employees = new HashMap<>();

    @Override
    public void update(Employee employee) {
        employees.put(employee.getId(),employee);
    }

    @Override
    public void deleteById(long id) {
        employees.remove(id);
    }

    @Override
    public Employee queryById(long id) {
        return employees.get(id);
    }

    @Override
    public void add(Employee employee) {
        employees.put(employee.getId(),employee);
    }

    @Override
    public List<Employee> queryAll() {
        return employees.values().stream().collect(Collectors.toList());
    }
}
