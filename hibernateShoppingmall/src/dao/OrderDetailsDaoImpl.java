package dao;

import javax.persistence.EntityManager;

import entities.OrderDetails;

public class OrderDetailsDaoImpl implements OrderDetailsDao
{
	private EntityManager entityManager;
	
	public OrderDetailsDaoImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public OrderDetails addOrderDetails(OrderDetails orderdetails)
	{
		entityManager.persist(orderdetails);
		return orderdetails;
	}

	@Override
	public OrderDetails updateOrderDetails(OrderDetails orderdetails) 
	{
		entityManager.merge(orderdetails);
		return orderdetails;
	}

	@Override
	public OrderDetails deleteOrderDetails(OrderDetails orderdetails) 
	{
		entityManager.remove(orderdetails);
		return orderdetails;
	}

	@Override
	public OrderDetails searchOrderDetailsById(int id) 
	{
		OrderDetails orderdetails = entityManager.find(OrderDetails.class, id);
		return orderdetails;
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
