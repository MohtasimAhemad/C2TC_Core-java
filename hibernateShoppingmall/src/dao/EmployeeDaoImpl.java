package dao;

import javax.persistence.EntityManager;

import entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao
{
	private EntityManager entityManager;

	public EmployeeDaoImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Employee addEmployee(Employee employee)
	{
		entityManager.persist(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) 
	{
		entityManager.merge(employee);
		return employee;
	}

	@Override
	public Employee searchEmployeeById(int id) 
	{
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

	@Override
	public Employee deleteEmployee(Employee employee) 
	{
		entityManager.remove(employee);
		return employee;
	}

	@Override
	public void commitTransaction() 
	{
		entityManager.getTransaction().commit();	
	}

	@Override
	public void beginTransaction()
	{
		entityManager.getTransaction().begin();
	}
}
