package training.c2tc.day57;

public class Employeee {

	int id;
	String name;
	double salary;
	/**
	 * @param id
	 * @param name
	 * @param salary
	 */
	public Employeee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean equals(Object o)
	{
		if(o instanceof Employeee)
		{
			return ((Employeee)o).id==this.id;
			
		}
		return false;
	}
	@Override
	public String toString() {
		return "Employeee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
