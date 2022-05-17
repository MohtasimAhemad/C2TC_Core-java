package training.c2tc.day69.hibernateinheritance.singletableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateSingleTableInheritanceMain 
{
	public static void main(String[] args)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");		

		EntityManager em = factory.createEntityManager();										
		em.getTransaction();																	
		
		Employee e = new Employee();
		e.setEmpName("Salman");
		e.setEmpSalary(22000);
		em.persist(e);														
		
		Manager m = new Manager();
		m.setEmpName("Maaz");
		m.setEmpSalary(89000);
		em.persist(m);
		
		em.getTransaction().commit();														
		System.out.println("Rows Inserted..!!");
		
		em.close();																				
		factory.close();														
	}
}
