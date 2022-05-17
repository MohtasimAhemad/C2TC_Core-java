package service;

import dao.StudentDao;
import dao.StudentDaoImpl;
import entities.Student;

public class StudentServiceImpl implements StudentService{

	private StudentDao dao;
	public StudentServiceImpl()
	 {
	dao = new StudentDaoImpl();
	}
	
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}

	public void updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}

	public void removeStudent(Student student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
	}

	public Student findStudentById(int id) {
//no need of transaction, as it's an read operation 
		Student student = dao.getStudentById(id);
		return student;
	}


}
