package training.c2tc.day69.hibernateinheritance.tableperclassinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class hibernatetableperclassinheritance 
{
	public static void main(String[] args)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction();
		
		Employee e = new Employee();
		e.setEmpName("Rutik");
		e.setEmpSalary(15000);
		em.persist(e);
		
		Manager m = new Manager();
		m.setEmpName("Vinay");
		m.setEmpSalary(50000);
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("Rows Inserted..!!");
		em.close();
		factory.close();
	}
}