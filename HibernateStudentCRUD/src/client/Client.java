package client;

import entities.Student;
import service.StudentService;
import service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		
				StudentService service = new StudentServiceImpl();
				Student student = new Student();
				
		// Create Operation 
				Student student1 = new Student();
				student1.setStudentId(1);
				student1.setName("shoaib");
				service.addStudent(student1);
				
				Student student11 = new Student();
				student11.setStudentId(2);
				student11.setName("ankit");
				service.addStudent(student11);
						
				Student student111 = new Student();
				student111.setStudentId(3);
				student111.setName("shahrukh");
				service.addStudent(student111);
				
		// Retrieve Operation 
				student = service.findStudentById(11);
				/*
				System.out.print("ID:" + student.getStudentId());
				System.out.println(" Name:" + student.getName());
			*/	
		/*	
		//Update Operation 
				student = service.findStudentById(1);
				student.setName("maaz");
				service.updateStudent(student);
				
				
				student = service.findStudentById(100);
				System.out.print("ID:" + student.getStudentId());
				System.out.println(" Name:" + student.getName());
				
		//Delete Operation 
				student = service.findStudentById(100);
				service.removeStudent(student);
				System.out.println("End of program/Life cycle completed...");	
		*/	
		
	}

}
