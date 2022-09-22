package collection;

import java.util.ArrayList;
import java.util.Iterator;

import relationshipEx.Student;

public class UserDefinedList {
	
	public static void main(String[]args) {
		ArrayList<StudentInfo>list=new ArrayList<StudentInfo>();
		list.add(new StudentInfo(101,"nikita",22));
		list.add(new StudentInfo(102,"ajay",25));
		list.add(new StudentInfo(103,"priya",21));
		list.add(new StudentInfo(104,"pooja",20));
		System.out.println(" using for each :");
		for(StudentInfo student : list) {
			System.out.println(student);
		}
		
		System.out.println("\n using Iterator :");
		Iterator<StudentInfo> itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}

}
