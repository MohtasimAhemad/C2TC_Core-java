package hibernateinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateSingleTableMain 
{
	public static void main(String[] args)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");		// Developed connection with database

		EntityManager em = factory.createEntityManager();										// Operation on database & create update insert delete got object for communication
		em.getTransaction().begin();															// Start communication
		
		Employee e = new Employee();
		e.setEmpName("Harish");
		e.setEmpSalary(35000);
		em.persist(e);																			// Started communication
		
		Manager m = new Manager();
		m.setEmpName("Sana");
		m.setEmpSalary(55000);
		em.persist(m);
		
		em.getTransaction().commit();															// End of communication
		System.out.println("Rows Inserted..!!");
		
		em.close();																				// Communication close
		factory.close();																		// Connection close
	}
}