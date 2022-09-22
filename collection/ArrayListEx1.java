package collection;
import java.util.ArrayList;
public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>list1=new ArrayList<String>();
		list1.add("nikita");
		list1.add("ajay");
		list1.add("priya");
		
		
		ArrayList<String>list2=new ArrayList<String>();
		list2.add("raj");
		list2.add("reema");
		list2.add("priya");
		list2.add("pooja");
		
		list1.addAll(list2);
		System.out.println("inserting 1 list into another :");
		for(String string : list1) {
			System.out.println(string);
		}
		System.out.println("inserting 1 list into another :");
		
		list1.removeAll(list2);
		for(String string : list1) {
			System.out.println(string);
		}
		
		System.out.println("\n element at 3 position :"+list2.get(3)); 
	}

}
