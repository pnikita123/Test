package collection;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		
		list.add("nikita");
		list.add("Ankita");
		list.add(1);
		list.add(23.5);
		list.add('A');
		list.add(null);
		list.add("nikita");
		
		System.out.println("Iterating list using Iterator :");
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		//System.out.println("non-generic :"+list);
		
		 ArrayList<String> list2=new ArrayList<String>();
		 list2.add("Mina");
		 list2.add("raj");
		 list2.add("kajal");
		 list2.add("seema");
		 System.out.println("\nIterating list using for each loop :");
		 for(String str : list2)
		 {
			 System.out.println(str); 
		 }
		 
		 
		// System.out.println("generic :"+list2);
	}

}
