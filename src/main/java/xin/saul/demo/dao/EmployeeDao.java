package xin.saul.demo.dao;

import xin.saul.demo.model.Employee;

import java.util.List;

public interface EmployeeDao {
    public void update(Employee employee);
    public void deleteById(long id);
    public Employee queryById(long id);
    public void add(Employee employee);
    public List<Employee> queryAll();
}
