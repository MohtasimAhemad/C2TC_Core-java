package entities;

import java.io.Serializable;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name = "order_details")

public class OrderDetails implements Serializable
{
	private static final long serialVersionUID =1L;
	
	@Id
	@Column(name ="OrderDetails_ID")
	private int id;
	
	@Column(name ="Date_of_purchase")
	private LocalDateTime dateOfPurchase;
	
	@Column(name ="Total")
	private float total;
	
	@Column(name ="Payment_Mode")
	private String paymentMode;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="Cust_Id")
	private Customer customer;
	
	public OrderDetails() {}

	public OrderDetails(int id, LocalDateTime dateOfPurchase, float total, String paymentMode, Customer customer)
	{
		this.id = id;
		this.dateOfPurchase = dateOfPurchase;
		this.total = total;
		this.paymentMode = paymentMode;
		this.customer = customer;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public LocalDateTime getDateOfPurchase() 
	{
		return dateOfPurchase;
	}

	public void setDateOfPurchase(LocalDateTime dateOfPurchase) 
	{
		this.dateOfPurchase = dateOfPurchase;
	}

	public float getTotal()
	{
		return total;
	}

	public void setTotal(float total) 
	{
		this.total = total;
	}

	public String getPaymentMode() 
	{
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) 
	{
		this.paymentMode = paymentMode;
	}

	public Customer getCustomer() 
	{
		return customer;
	}

	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}

	@Override
	public String toString() 
	{
		return "OrderDetails [id=" + id + ", dateOfPurchase=" + dateOfPurchase + ", total=" + total + ", paymentMode="
				+ paymentMode + ", customer=" + customer + "]";
	}
}