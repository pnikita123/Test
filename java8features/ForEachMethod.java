package java8features;

import java.util.ArrayList;

public class ForEachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list =new ArrayList<String>();
		list.add("Kolhapur");
		list.add("Pune");
		list.add("Chennai");
		list.add("Mumbai");
		list.add("Thane");
		
		list.forEach(str -> System.out.println(str));
		

	}

}
