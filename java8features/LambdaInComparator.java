package java8features;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Stream.Collection;

public class LambdaInComparator {
	public static void main(String[]args) {
		
		ArrayList<Product> list=new ArrayList<Product>();
		list.add(new Product(101,"Mouse",2000));
		list.add(new Product(101,"Laptop",2000));
		list.add(new Product(101,"Keyboard",2000));
		list.add(new Product(101,"Desktop",2000));
		list.add(new Product(101,"Speaker",2000));
		
		/*Collections.sort(list,(p1,p2) ->{
			return p1.prodName.compareTo(p2.prodName);
	     });*/
		
		
		list.forEach(p -> System.out.println(p));
	
	}

}
