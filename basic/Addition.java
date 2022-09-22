package basic;

 class A{
	 public void addition() {
		 int a=12;
		 int b=12;
		 int c=a+b;
		 System.out.println("Addition is"+c);
		 
	 }
	
}
 class B extends A{
	 public void sub () {
		 int a=12;
		 int b=12;
		 int c=a-b;
		 System.out.println("Sub is"+c);
	}
 }


public class Addition {
	public static void main(String[] args) {
		B obj=new B();
		obj.addition();
		obj.sub();
		
		
	}
	
	}

