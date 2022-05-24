package dao;

import entities.Employee;

public interface EmployeeDao
{
	public abstract Employee addEmployee(Employee employee);
	public abstract Employee updateEmployee(Employee employee);
	
	public abstract Employee searchEmployeeById(int id);
	public abstract Employee deleteEmployee(Employee employee);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}

