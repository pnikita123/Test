package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplEx {
	public static void main(String[] args) {
		Set<String> hSet=new HashSet<String>();
		hSet.add("Apple");
		hSet.add("Mango");
		hSet.add("Guava");
		hSet.add("Banana");
		hSet.add("Apple");
		hSet.add(null);
		
		System.out.println("implement HasSet :");
		for(String string : hSet) {
			System.out.println(string);					
		}
		
		LinkedHashSet<String> linkedhSet=new LinkedHashSet<String>();
		linkedhSet.add("Pizza");
		linkedhSet.add("Coffee");
		linkedhSet.add("Biryani");
		linkedhSet.add("Coffee");
		linkedhSet.add(null);
		
		System.out.println("\nimplement LinkedHashSet :");
		for(String string : linkedhSet) {
			System.out.println(string);					
		}
		
		TreeSet<String> treeSet=new TreeSet<String>();
		treeSet.add("Lotus");
		treeSet.add("Rose");
		treeSet.add("Mogara");
		treeSet.add("Lily");
		treeSet.add("Lotus");
		
		System.out.println("\nimplement TreeSet :");
		for(String string : treeSet) {
			System.out.println(string);					
		}
		
		
		
	}

}
