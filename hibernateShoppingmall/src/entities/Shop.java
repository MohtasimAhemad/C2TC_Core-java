package entities;


import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name = "shop")

public class Shop implements Serializable
{
	private static final long serialVersionUID =1L;
	
	@Id
	@Column(name ="Shop_ID")
	private int shopId;
	
	@Column(name ="Shop_Category")
	private String shopCategory;
	
	@Column(name ="Shop_Name")
	private String shopName;
	
	@Column(name ="Customers")
	private String customers;
	
	@Column(name ="Shop_Status")
	private String shopStatus;
	
	@Column(name ="Lease_Status")
	private String leaseStatus;

	@OneToMany(mappedBy ="shop")
	private Set<Employee> employee;
	
	@OneToMany(mappedBy ="shop")
	private Set<Item> item;
	
	public Shop() {}
	
	public Shop(int shopId, String shopCategory, String shopName, String customers, String shopStatus,
			String leaseStatus, Set<Employee> employee, Set<Item> item) 
	{
		this.shopId = shopId;
		this.shopCategory = shopCategory;
		this.shopName = shopName;
		this.customers = customers;
		this.shopStatus = shopStatus;
		this.leaseStatus = leaseStatus;
		this.employee = employee;
		this.item = item;
	}

	public int getShopId() 
	{
		return shopId;
	}
	
	public void setShopId(int shopId) 
	{
		this.shopId = shopId;
	}
	
	public String getShopCategory()
	{
		return shopCategory;
	}
	
	public void setShopCategory(String shopCategory) 
	{
		this.shopCategory = shopCategory;
	}

	public String getShopName() 
	{
		return shopName;
	}
	
	public void setShopName(String shopName) 
	{
		this.shopName = shopName;
	}
	
	public String getCustomers() 
	{
		return customers;
	}
	public void setCustomers(String customers)
	{
		this.customers = customers;
	}
	
	public String getShopStatus()
	{
		return shopStatus;
	}
	
	public void setShopStatus(String shopStatus)
	{
		this.shopStatus = shopStatus;
	}
	
	public String getLeaseStatus() 
	{
		return leaseStatus;
	}
	
	public void setLeaseStatus(String leaseStatus) 
	{
		this.leaseStatus = leaseStatus;
	}

	public Set<Employee> getEmployee()
	{
		return employee;
	}

	public void setEmployee(Set<Employee> employee)
	{
		this.employee = employee;
	}

	public Set<Item> getItem() 
	{
		return item;
	}

	public void setItem(Set<Item> item) 
	{
		this.item = item;
	}

	@Override
	public String toString() 
	{
		return "Shop [shopId=" + shopId + ", shopCategory=" + shopCategory + ", shopName=" + shopName + ", customers="
				+ customers + ", shopStatus=" + shopStatus + ", leaseStatus=" + leaseStatus + ", employee=" + employee + ", item=" + item + "]";
	}	
}