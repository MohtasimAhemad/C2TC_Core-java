package entities;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "mall_admin")

public class MallAdmin implements Serializable
{
	private static final long serialVersionUID =1L;
	
	@Id
	@Column(name ="MallAdmin_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name ="MallAdmin_Name")
	private String name;
	
	@Column(name ="Password")
	private String password;
	
	@Column(name ="MallAdmin_PhoneNo")
	private String phone;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="Mall_Id")
	private Mall mall;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="User_Id")
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="ShopOwner_Id")
	private ShopOwner shopowner;
	
	public MallAdmin() {}
	
	public MallAdmin(int id, String name, String password, String phone, Mall mall, User user, ShopOwner shopowner) 
	{
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.mall = mall;
		this.user = user;
		this.shopowner = shopowner;
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
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public Mall getMall() 
	{
		return mall;
	}
	
	public void setMall(Mall mall)
	{
		this.mall = mall;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) 
	{
		this.user = user;
	}

	public ShopOwner getShopowner()
	{
		return shopowner;
	}

	public void setShopowner(ShopOwner shopowner) 
	{
		this.shopowner = shopowner;
	}

//	@Override
//	public String toString() 
//	{
//		return "MallAdmin [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + ", mall="
//				+ mall + ", user=" + user + ", shopowner=" + shopowner + "]";
//	}
}