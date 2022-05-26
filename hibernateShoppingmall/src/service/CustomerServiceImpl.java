package service;

import dao.CustomerDao;
import dao.CustomerDaoImpl;
import entities.Customer;

public class CustomerServiceImpl implements CustomerService
{
	private CustomerDao custDao;
	
	public CustomerServiceImpl()
	{
		custDao = new CustomerDaoImpl();
	}

	@Override
	public Customer addCustomer(Customer customer) 
	{
	
		custDao.beginTransaction();
		custDao.addCustomer(customer);
		custDao.commitTransaction();
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) 
	{
		custDao.beginTransaction();
		custDao.updateCustomer(customer);
		custDao.commitTransaction();
		return customer;
	}

	@Override
	public Customer searchCustomerById(int id) 
	{
		Customer customer = custDao.searchCustomerById(id);
		return customer;
	}

	@Override
	public Customer deleteCustomer(Customer customer) 
	{
		custDao.beginTransaction();
		custDao.deleteCustomer(customer);
		custDao.commitTransaction();
		return customer;
	}
}
