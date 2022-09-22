package collection;

import java.util.Stack;


public class StackEx {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		
		stack.add("lotus");
		stack.add("lily");
		stack.add("rose");
		stack.add("mogara");
		stack.add(null);
		
		
		System.out.println(stack);
		System.out.println("\n remove element "+stack.pop());
		System.out.println(stack);
		System.out.println("\n searching element "+stack.search("rose"));
		System.out.println("\n searching element "+stack.search("mogara"));
	}
	
	
}
