package training.c2tc.day69.hibernateinheritance.singletableinheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

@DiscriminatorValue("MANAGER")

public class Manager extends Employee
{
	private static final long serialVersionUID =1L;
	
	@Column(name = "Department_Name")
	private String deptName;
	
	public Manager() {}
	
	public Manager(String deptName) 
	{
		this.deptName = deptName;
	}

	public String getDepartmentName() 
	{
		return deptName;
	}

	public void setDepartmentName(String deptName)
	{
		this.deptName = deptName;
	}
}