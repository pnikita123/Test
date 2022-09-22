package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentInfo> list =new ArrayList<StudentInfo>();
		
		list.add(new StudentInfo(100,"nikita",21));
		list.add(new StudentInfo(102,"nita",20));
		list.add(new StudentInfo(104,"nilesh",19));
		list.add(new StudentInfo(106,"ram",24));
		
		System.out.println("Sorting on the basis age :");
		Collections.sort(list,new AgeComparator());
		for(StudentInfo student:list) {
			System.out.println(student);
		}
		System.out.println("Sorting on the basis name :");
		Collections.sort(list,new NameComparator()); 
		for(StudentInfo student:list) {
			System.out.println(student);
		}
		

	}

}
