package training.c2tc.day69.hibernateinheritance.joinedinheritance;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class HibernatejoinedinheritanceMain 
{
	public static void main(String[] args)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee e = new Employee();
		e.setEmpName("subash");
		e.setEmpSalary(25000);
		em.persist(e);
		
		Manager m = new Manager();
		m.setEmpName("pooja");
		m.setEmpSalary(60000);
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("Rows Inserted.");
		em.close();
		factory.close();
	}
}