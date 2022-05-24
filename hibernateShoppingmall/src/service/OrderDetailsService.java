package service;

import entities.OrderDetails;

public interface OrderDetailsService
{
	public abstract OrderDetails addOrderDetails(OrderDetails orderdetails);
	public abstract OrderDetails updateOrderDetails(OrderDetails orderdetails);
	public abstract OrderDetails deleteOrderDetails(OrderDetails orderdetails);
	public abstract OrderDetails searchOrderDetailsById(int id);
}
