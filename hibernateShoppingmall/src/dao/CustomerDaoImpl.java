package dao;

import javax.persistence.EntityManager;

import entities.Customer;

public class CustomerDaoImpl implements CustomerDao
{
	private EntityManager entityManager;

	public CustomerDaoImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Customer addCustomer(Customer customer) 
	{
		entityManager.persist(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) 
	{
		entityManager.merge(customer);
		return customer;
	}

	@Override
	public Customer searchCustomerById(int id) 
	{
		Customer customer = entityManager.find(Customer.class, id);
		return customer;
	}

	@Override
	public Customer deleteCustomer(Customer customer)
	{
		entityManager.remove(customer);
		return customer;
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