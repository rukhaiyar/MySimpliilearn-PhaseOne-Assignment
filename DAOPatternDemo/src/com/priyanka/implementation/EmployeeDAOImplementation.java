package com.priyanka.implementation;

import java.util.ArrayList;
import java.util.List;

import com.priyanka.contract.EmployeeDAO;
import com.priyanka.models.Employee;

public class EmployeeDAOImplementation implements EmployeeDAO {
	
	List<Employee> employees;

	public EmployeeDAOImplementation() {
		employees = new ArrayList<Employee>();
		
		employees.add(new Employee(101, "Priyanka"));
		employees.add(new Employee(102, "Annie"));
		employees.add(new Employee(103, "Pallavi"));
		employees.add(new Employee(104, "Abhishek"));
		employees.add(new Employee(105, "Aanya"));
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		return employees;
	}

	@Override
	public Employee getEmployee(int empId) {
		return employees.get(empId);
	}

	@Override
	public void updateEmployee(Employee employee) {

		if(employees.contains(employee)) {
			System.out.println("Employee FOund");
			for(Employee employee1 : employees) {
				if(employee1.getEmployeeId() == employee.getEmployeeId()) {
					employee1.setEmployeeName(employee.getEmployeeName());
					System.out.println("Updated employee : " + employee);
				}
			}
		}
		else {
			System.out.println("Not found");
		}
		employees.get(employee.getEmployeeId()).setEmployeeName(employee.getEmployeeName());
		System.out.println(employee + "successfully updated");
	}

	@Override
	public void deleteEmployee(Employee employee) {
		
		employees.remove(employee.getEmployeeId());
		
		System.out.println(employee + "successfully removed");
		
	}

}
