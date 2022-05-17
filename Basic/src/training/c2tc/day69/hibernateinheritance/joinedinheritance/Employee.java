package training.c2tc.day69.hibernateinheritance.joinedinheritance;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity

@Table(name = "employee2")
@Inheritance(strategy = InheritanceType.JOINED)


public class Employee implements Serializable
{
	private static final long serialVersionUID =1L;
	
	@Id
	@Column(name ="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	
	@Column(name ="Name")
	private String empName;
	
	@Column(name = "Salary")
	private double empSalary;
	
	public Employee() {}

	public Employee(int empId, String empName, double empSalary) 
	{
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() 
	{
		return empId;
	}

	public void setEmpId(int empId) 
	{
		this.empId = empId;
	}

	public String getEmpName() 
	{
		return empName;
	}

	public void setEmpName(String empName)
	{
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) 
	{
		this.empSalary = empSalary;
	}
}