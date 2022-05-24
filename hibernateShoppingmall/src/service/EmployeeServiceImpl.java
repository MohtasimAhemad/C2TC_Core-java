package service;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import entities.Employee;

public class EmployeeServiceImpl implements EmployeeService
{
	private EmployeeDao dao;
	
	public EmployeeServiceImpl()
	{
		dao = new EmployeeDaoImpl();
	}

	@Override
	public Employee addEmployee(Employee employee)
	{
		dao.beginTransaction();
		dao.addEmployee(employee);
		dao.commitTransaction();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) 
	{
		dao.beginTransaction();
		dao.updateEmployee(employee);
		dao.commitTransaction();
		return employee;
	}

	@Override
	public Employee searchEmployeeById(int id) 
	{
		Employee employee = dao.searchEmployeeById(id);
		return employee;
	}

	@Override
	public Employee deleteEmployee(Employee employee) 
	{
		dao.beginTransaction();
		dao.deleteEmployee(employee);
		dao.commitTransaction();
		return employee;
	}
}
