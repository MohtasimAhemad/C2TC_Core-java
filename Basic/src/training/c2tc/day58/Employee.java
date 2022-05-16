package training.c2tc.day58;

public class Employee implements Comparable<Employee>{

	int emp_id;
	int salary;
	String name;
	String department;
	/**
	 * @param emp_id
	 * @param salary
	 * @param name
	 * @param department
	 */
	public Employee(int emp_id, int salary, String name, String department) {
		super();
		this.emp_id = emp_id;
		this.salary = salary;
		this.name = name;
		this.department = department;
	}
	
	public int compareTo(Employee t)
	{
		return this.emp_id-t.emp_id;
	}
	
}
