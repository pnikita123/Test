package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<EmployeeEx> list =new ArrayList<EmployeeEx>();
		list.add(new EmployeeEx(100,"nikita",21));
		list.add(new EmployeeEx(102,"nita",20));
		list.add(new EmployeeEx(104,"nilesh",19));
		list.add(new EmployeeEx(106,"ram",24));
		list.add(new EmployeeEx(107,"raj",26));
		
		System.out.println("Assending Order");
		Collections.sort(list);
		for(EmployeeEx employee:list) {
			System.out.println(employee);
		}
		
		System.out.println("\nDescending Order");
		Collections.reverse(list);
		for(EmployeeEx employee:list) {
			System.out.println(employee);
		}

	}

}
