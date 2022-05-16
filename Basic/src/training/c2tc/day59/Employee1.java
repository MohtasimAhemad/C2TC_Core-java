package training.c2tc.day59;

import java.util.Comparator;

import training.c2tc.day58.Employee;

public class Employee1 implements Comparator<Employee>{

	    int id;
	    String name;
	    int salary;
	    int age;
		
		

		/**
		 * @param id
		 * @param name
		 * @param salary
		 * @param age
		 */
		public Employee1(int id, String name, int salary, int age) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.age = age;
		}



		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return 0;
		}		
		

}
