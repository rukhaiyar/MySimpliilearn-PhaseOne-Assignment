package com.priyanka.models;

public class Employee {
	
	private int EmployeeId;
	private String EmployeeName;
	public Employee() {
		super();
	}
	public Employee(int employeeId, String employeeName) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
	}
	
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + "]";
	}
	
	

}
