package java8features;

import java.util.ArrayList;

public class WithoutStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> array=new ArrayList<String>();
		array.add("Nikita");
		array.add("Ankita");
		array.add("Nilam");
		array.add("Mina");
		array.add("Kajal");
		
		int count=0;
		for(String string : array) {
			if(string.length()>5)
				count++;
		}
		System.out.println("Ther are"+count+" Strings with length less than 5");
	}

}
