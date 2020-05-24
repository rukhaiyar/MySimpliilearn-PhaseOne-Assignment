package com.priyanka.contract;

import java.util.List;
import com.priyanka.models.Employee;


public interface EmployeeDAO {
	
	public List<Employee> getAllEmployees();
	public Employee getEmployee(int empId);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	
}
