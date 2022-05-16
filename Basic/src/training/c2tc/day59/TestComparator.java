package training.c2tc.day59;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(new Student(1,"maaz",78));
		a1.add(new Student(2,"mohtasim",98));
		a1.add(new Student(3,"faiz",88));
		System.out.println("sorting by Age ");
		Collections.sort(a1,new AgeCpomparator());
		for(Student s1:a1)
		{
			System.out.println(s1.rollno+"  "+s1.name+"  "+s1.age);
		}
		
		System.out.println("");
		
		System.out.println("sorting by name ");
		Collections.sort(a1,new NameComparator());
		for(Student s1:a1)
		{
			System.out.println(s1.rollno+"  "+s1.name+"  "+s1.age);
		}
		
		
	}

}
