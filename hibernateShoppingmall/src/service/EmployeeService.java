package service;

import entities.Employee;

public interface EmployeeService 
{
	public abstract Employee addEmployee(Employee employee);
	public abstract Employee updateEmployee(Employee employee);
	
	public abstract Employee searchEmployeeById(int id);
	public abstract Employee deleteEmployee(Employee employee);
}
