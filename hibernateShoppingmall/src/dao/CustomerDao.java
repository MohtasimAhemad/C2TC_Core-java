package dao;


import entities.Customer;

public interface CustomerDao {
	
		public abstract Customer addCustomer(Customer customer);
		public abstract Customer updateCustomer(Customer customer);
		
		public abstract Customer searchCustomerById(int id);
		public abstract Customer deleteCustomer(Customer customer);
		
		public abstract void beginTransaction();
		public abstract void commitTransaction();
	}

