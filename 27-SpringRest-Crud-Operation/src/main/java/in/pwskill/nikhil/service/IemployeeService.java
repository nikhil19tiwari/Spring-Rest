package in.pwskill.nikhil.service;

import java.util.List;

import in.pwskill.nikhil.model.Employee;

public interface IemployeeService {
public Integer saveEmployee(Employee employee);
public List<Employee>getAllemployee();
public Employee getOneempoyee(Integer id);
public String updateEmployee(Employee employee);
public String deleteEmployee(Integer id);
}
