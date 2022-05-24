package dao;

import entities.OrderDetails;

public interface OrderDetailsDao 
{
	public abstract OrderDetails addOrderDetails(OrderDetails orderdetails);
	public abstract OrderDetails updateOrderDetails(OrderDetails orderdetails);
	public abstract OrderDetails deleteOrderDetails(OrderDetails orderdetails);
	public abstract OrderDetails searchOrderDetailsById(int id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
