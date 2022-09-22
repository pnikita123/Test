package collection;
import java.util.ArrayDeque;
import java.util.Deque;


public class ArrayDequeEx {

	public static void main(String[] args) {
    Deque<String> deque=new ArrayDeque<String>();
		
    deque.add("Tea");
    deque.offer("Coffee");
    deque.offer("Sandwich");
    deque.offer("Burger");
    deque.offer("Cold-Drink");

    for(String string : deque) {
		System.out.println(string);	
		
	}
    
    System.out.println("\nAfter removing 1 st element :");	
    deque.pollFirst();
	for(String string : deque) {
		System.out.println(string);	
		
	}
	
	 System.out.println("\nAfter removing last  element :");	
	    deque.pollLast();
		for(String string : deque) {
			System.out.println(string);	
			
		}
		
	}

}
