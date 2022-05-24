package client;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Customer;
import entities.Employee;
import entities.Item;
import entities.Mall;
import entities.MallAdmin;
import entities.OrderDetails;
import entities.Shop;
import entities.ShopOwner;
import entities.User;
import service.CustomerService;
import service.CustomerServiceImpl;
import service.EmployeeService;
import service.EmployeeServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;
import service.MallAdminService;
import service.MallAdminServiceImpl;
import service.MallService;
import service.MallServiceImpl;
import service.OrderDetailsService;
import service.OrderDetailsServiceImpl;
import service.ShopOwnerService;
import service.ShopOwnerServiceImpl;
import service.ShopService;
import service.ShopServiceImpl;
import service.UserService;
import service.UserServiceImpl;

public class Client {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		CustomerService cservice = new CustomerServiceImpl();
		EmployeeService eservice = new EmployeeServiceImpl();
		ItemService iservice = new ItemServiceImpl();
		MallAdminService mservice = new MallAdminServiceImpl();
		MallService mmservice = new MallServiceImpl();
		OrderDetailsService odservice = new OrderDetailsServiceImpl();
		ShopOwnerService soservice = new ShopOwnerServiceImpl();
		ShopService sservice = new ShopServiceImpl();
		UserService uservice = new UserServiceImpl();

		
		
		
		
		/********* Customer *********/
		
		
		
		// Add records in Customer Table.
		// record 1
		Customer cust = new Customer(); // Customer Object 1
		cust.setId(101);
		cust.setName("Kartik");
		cust.setPhone("7066066070");
		cust.setEmail("Kartik@gmail.com");

		// record 2
		Customer cust1 = new Customer(); // Customer Object 2
		cust1.setId(102);
		cust1.setName("Suhana");
		cust1.setPhone("7072737475");
		cust1.setEmail("Suhana@gmail.com");

		System.out.println("Records Inserted  in Customer Table");

		
		
		
		
		
		/********* Employee *********/
		
		
		
		
		// Add records in employee Table.
		// record 1
		Employee emp = new Employee(); // Employee Object 1
		LocalDate date = LocalDate.of(1998, 07, 8);
		emp.setName("Mohtasim");
		emp.setDob(date);
		emp.setSalary(40000);
		emp.setAddress("Nashik");
		emp.setDesignation("Manager");

		// record 2
		Employee emp1 = new Employee(); // Employee Object 1
		LocalDate date1 = LocalDate.of(1998, 8, 12);

		emp1.setName("Uzair");
		emp1.setDob(date1);
		emp1.setSalary(20000);
		emp1.setAddress("Nashik");
		emp1.setDesignation("Associate");

		System.out.println("Records Inserted in Employee Table");

		
		
		
		
		/********* Item *********/
		
		
		
		// Add records of Item Table.
		// record 1
		Item item = new Item();
		LocalDate date2 = LocalDate.of(2021, 3, 15);
		LocalDate date3 = LocalDate.of(2027, 1, 13);

		item.setName("Canon cam");
		item.setManufacturing(date2);
		item.setExpiry(date3);
		item.setPrice(156000);
		item.setCategory("Cameras");

		// record 2
		Item item1 = new Item();
		LocalDate date4 = LocalDate.of(2022, 1, 20);
		LocalDate date5 = LocalDate.of(2030, 3, 21);

		item1.setName("Samsung Tv");
		item1.setManufacturing(date4);
		item1.setExpiry(date5);
		item1.setPrice(50000);
		item1.setCategory("Televisions");

		System.out.println("Records Inserted in Item Table");

		/********* MallAdmin *********/
		// Add records of MallAdmin Table.
		// record 1
		MallAdmin mallad = new MallAdmin();
		mallad.setName("Mansi");
		mallad.setPassword("Mansi@123");
		mallad.setPhone("9695832147");

		// record 2
		MallAdmin mallad1 = new MallAdmin();
		mallad1.setName("Vikas");
		mallad1.setPassword("vikas@123");
		mallad1.setPhone("8550595321");

		System.out.println("Records Inserted in MallAdmin Table");

		/********* Mall *********/

		// Add records of Mall Table.
		// record 1
		Mall mall = new Mall();

		mall.setId(11);
		mall.setMallName("City Centre");
		mall.setLocation("pune");
		mall.setCategories("Metro city");

		// record 2
		Mall mall1 = new Mall();

		mall1.setId(12);
		mall1.setMallName("Pinnacle ");
		mall1.setLocation("Nashik");
		mall1.setCategories("Urban city");

		System.out.println("Records Inserted in Mall Table");

		/********* OrderDetails *********/
		// Add records of OrderDetails Table.
		// record 1
		OrderDetails od = new OrderDetails();
		LocalDateTime datetime = LocalDateTime.of(2022, 4, 28, 11, 31);

		od.setDateOfPurchase(datetime);
		od.setTotal(156000);
		od.setPaymentMode("Online");

		// record 2
		OrderDetails od1 = new OrderDetails();
		LocalDateTime datetime1 = LocalDateTime.of(2022, 2, 16, 2, 13);

		od1.setDateOfPurchase(datetime1);
		od1.setTotal(50000);
		od1.setPaymentMode("Online");

		System.out.println("Records Inserted in OrderDetails Table");

		/********* Shop *********/
		// Add records for shop Table.
		// record 1
		Shop shp = new Shop();

		shp.setShopId(101);
		shp.setShopCategory("Electronics");
		shp.setShopName("Croma");
		shp.setCustomers("window");
		shp.setShopStatus("Open");
		shp.setLeaseStatus("On Lease");

		// record 2
		Shop shp1 = new Shop();

		shp1.setShopId(102);
		shp1.setShopCategory("Electronics");
		shp1.setShopName("Reliance Digital");
		shp1.setCustomers("Regular");
		shp1.setShopStatus("Open");
		shp1.setLeaseStatus("Owned");

		System.out.println("Records Inserted in Shop Table");

		/********* ShopOwner *********/
		// Add records for ShopOwner Table.
		ShopOwner shown = new ShopOwner();
		LocalDate date6 = LocalDate.of(1996, 12, 9);

		// record 1
		shown.setId(001100);
		shown.setName("Aniket");
		shown.setDob(date6);
		shown.setAddress("1A , Gokul Nagar , Thane  ");

		// record 2
		ShopOwner shown1 = new ShopOwner();
		LocalDate date7 = LocalDate.of(1995, 9, 12);

		shown1.setId(001200);
		shown1.setName("Roshan");
		shown1.setDob(date7);
		shown1.setAddress("2, Pokhran Rd, Pawar Nagar, Thane ");

		System.out.println("Records Inserted in ShopOwner Table");

		/********* User *********/
		// Add records for User Table.
		// record 1
		User user = new User();

		user.setId(112233);
		user.setName("Kartik001");
		user.setType("Hands off");
		user.setPassword("Anu1234");

		// record 2
		User user1 = new User();

		user1.setId(223344);
		user1.setName("Suhana002");
		user1.setType("Regular");
		user1.setPassword("Rushi@007");

		System.out.println("Records Inserted in User Table");

		/********* One To One Mapping *********/

		// Customer & USer
		cust.setUser(user);
		cust1.setUser(user1);

		em.persist(cust);
		em.persist(cust1);

		// MallAdmin & User
		mallad.setUser(user);
		mallad1.setUser(user1);

		em.persist(mallad);
		em.persist(mallad1);

		// MallAdmin & Mall
		mallad.setMall(mall);
		mallad1.setMall(mall1);

		em.persist(mallad);
		em.persist(mallad1);

		// MallAdmin & ShopOwner
		mallad.setShopowner(shown);
		mallad1.setShopowner(shown1);

		em.persist(mallad);
		em.persist(mallad1);

		/********* One To Many Mapping *********/

		// Customer & OrderDetails

		od.setCustomer(cust);
		od1.setCustomer(cust1);

		em.persist(od);
		em.persist(od1);

		// Shop & Employee

		emp.setShop(shp);
		emp1.setShop(shp1);

		em.persist(emp);
		em.persist(emp1);

		// Shop & Item

		item.setShop(shp);
		item1.setShop(shp1);

		em.persist(item);
		em.persist(item1);

		em.getTransaction().commit();

		em.close();
		factory.close();

		// Retrieve operation
		/*
		 * emp = es.searchEmployeeById(2); System.out.println("Id: "+emp.getId());
		 * System.out.println("Name: "+emp.getName()); System.out.println(emp);
		 */

		// Update operation
		/*
		 * emp = es.searchEmployeeById(3); emp.setName("Harsh"); emp.setSalary(15000);
		 * emp.setAddress("Diva"); emp.setDesignation("Store Keeper");
		 * es.updateEmployee(emp);
		 */

		// System.out.println("Rows Updated");

		// Delete operation
		/*
		 * emp = es.searchEmployeeById(3); System.out.println(emp);
		 * es.deleteEmployee(emp);
		 * 
		 * System.out.println("Row Deleted");
		 */

	}
}