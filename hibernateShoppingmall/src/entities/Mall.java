package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "mall")

public class Mall implements Serializable
{
	private static final long serialVersionUID =1L;
	
	@Id
	@Column(name ="Mall_ID")
	private int Id;
	
	@Column(name ="Mall_Name")
	private String mallName;
	
	@Column(name ="Location")
	private String location;
	
	@Column(name ="Categories")
	private String categories;
	
	@OneToOne(mappedBy ="mall")
	private MallAdmin mallAdmin;
	
	public Mall() {}

	public Mall(int id, String mallName, String location, String categories, MallAdmin mallAdmin)
	{
		Id = id;
		this.mallName = mallName;
		this.location = location;
		this.categories = categories;
		this.mallAdmin = mallAdmin;
	}

	public long getId() 
	{
		return Id;
	}

	public void setId(int id) 
	{
		Id = id;
	}

	public String getMallName() 
	{
		return mallName;
	}

	public void setMallName(String mallName)
	{
		this.mallName = mallName;
	}

	public String getLocation() 
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public String getCategories()
	{
		return categories;
	}

	public void setCategories(String categories) 
	{
		this.categories = categories;
	}

	public MallAdmin getMallAdmin()
	{
		return mallAdmin;
	}

	public void setMallAdmin(MallAdmin mallAdmin)
	{
		this.mallAdmin = mallAdmin;
	}

	@Override
	public String toString()
	{
		return "Mall [Id=" + Id + ", mallName=" + mallName + ", location=" + location + ", categories=" + categories
				+ ", mallAdmin=" + mallAdmin + "]";
	}
}