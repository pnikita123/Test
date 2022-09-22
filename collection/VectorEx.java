package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<String> vector=new Vector<String>();
		
		vector.addElement("Kamal");
		vector.add("Raj");
		vector.add("Seema");
		vector.add("Rani");
		vector.add("null");
		
	Enumeration<String> em=vector.elements();
	while(em.hasMoreElements())
	{
		System.out.println(em.nextElement());
	}
	}

}
