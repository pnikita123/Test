package java8features;

import java.util.ArrayList;

public class WithStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array=new ArrayList<String>();
		array.add("Nikita");
		array.add("Ankita");
		array.add("Nilam");
		array.add("Mina");
		array.add("Kajal");
		
		long count=array.stream().filter(str-> str.length()<5).count();
		
		System.out.println("Ther are"+count+" Strings with length less than 5");
			
	}

}
