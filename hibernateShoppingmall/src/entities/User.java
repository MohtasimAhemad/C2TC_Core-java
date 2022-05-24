package entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "user")

public class User implements Serializable
{
	private static final long serialVersionUID =1L;
	
	@Id
	@Column(name ="User_ID")
	private int id;
	
	@Column(name ="User_Name")
	private String name;
	
	@Column(name ="User_Type")
	private String type;
	
	@Column(name ="Password")
	private String password;
	
	@OneToOne(mappedBy ="user")
	private Customer customer;
	
	@OneToOne(mappedBy ="user")
	private MallAdmin malladmin;
	
	public User() {}
	
	public User(int id, String name, String type, String password, Customer customer, MallAdmin malladmin)
	{
		this.id = id;
		this.name = name;
		this.type = type;
		this.password = password;
		this.customer = customer;
		this.malladmin = malladmin;
	}

	public int getId() 
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getType() 
	{
		return type;
	}
	
	public void setType(String type) 
	{
		this.type = type;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}

	public Customer getCustomer() 
	{
		return customer;
	}

	public void setCustomer(Customer customer) 
	{
		this.customer = customer;
	}
	
	public MallAdmin getMalladmin()
	{
		return malladmin;
	}

	public void setMalladmin(MallAdmin malladmin) 
	{
		this.malladmin = malladmin;
	}

	@Override
	public String toString() 
	{
		return "User [id=" + id + ", name=" + name + ", type=" + type + ", password=" + password + ", customer="
				+ customer + ", malladmin=" + malladmin + "]";
	}
}