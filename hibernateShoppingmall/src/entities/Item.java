package entities;


import java.io.Serializable;
import java.time.LocalDate;

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

@Table(name = "item")
public class Item implements Serializable
{
	private static final long serialVersionUID =1L;
	
	@Id
	@Column(name ="Item_ID")
	private long id;
	
	@Column(name ="Item_Name")
	private String name;
	
	@Column(name ="Manufacturing")
	private LocalDate manufacturing;
	
	@Column(name ="Expiry_Date")
	private LocalDate expiry;
	
	@Column(name ="Price")
	private float price;
	
	@Column(name ="Category")
	private String category;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="ShopItem_Id")
	private Shop shop;
	
	public Item() {}
	
	public Item(long id, String name, LocalDate manufacturing, LocalDate expiry, float price, String category,
			Shop shop) 
	{
		this.id = id;
		this.name = name;
		this.manufacturing = manufacturing;
		this.expiry = expiry;
		this.price = price;
		this.category = category;
		this.shop = shop;
	}

	public long getId() 
	{
		return id;
	}
	
	public void setId(long id) 
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
	
	public float getPrice()
	{
		return price;
	}
	
	public void setPrice(float price) 
	{
		this.price = price;
	}
	
	public String getCategory() 
	{
		return category;
	}
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	public LocalDate getManufacturing() 
	{
		return manufacturing;
	}
	
	public void setManufacturing(LocalDate manufacturing)
	{
		this.manufacturing = manufacturing;
	}
	
	public LocalDate getExpiry() 
	{
		return expiry;
	}
	
	public void setExpiry(LocalDate expiry)
	{
		this.expiry = expiry;
	}

	public Shop getShop() 
	{
		return shop;
	}

	public void setShop(Shop shop) 
	{
		this.shop = shop;
	}

//	@Override
//	public String toString() 
//	{
//		return "Item [id=" + id + ", name=" + name + ", manufacturing=" + manufacturing + ", expiry=" + expiry
//				+ ", price=" + price + ", category=" + category + ", shop=" + shop + "]";
//	}
}