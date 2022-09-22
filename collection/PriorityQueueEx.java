package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		Queue<String> queue=new PriorityQueue<String>();
		
		queue.add("Nikita");
		queue.offer("Ankita");
		queue.offer("Ram");
		queue.offer("Nikita");
		queue.offer("Rahul");
		
		
		for(String string : queue) {
			System.out.println(string);	
			
		}
		System.out.println("\n Head of queue :"+queue.element());	
		
		System.out.println("\n Removing element using remove :"+queue.remove());
		System.out.println("After removing :");	
		for(String string : queue) {
			System.out.println(string);	
			
		}
		
		System.out.println("\n Removing element using poll :"+queue.poll());
		System.out.println("After removing :");	
		for(String string : queue) {
			System.out.println(string);	
			
		}
		
	}
}
