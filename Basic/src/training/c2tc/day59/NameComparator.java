package training.c2tc.day59;

import java.util.Comparator;

import training.c2tc.day59.Student;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.name.compareTo(s2.name);
		
	}
	

}
