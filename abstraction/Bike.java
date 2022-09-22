package abstraction;

public abstract class Bike {
	 Bike()
	 {
		 System.out.println("Constructor in a abstract class");
	 }
	 
	 public abstract void run();
	 
	 public void display() {
		 System.out.println("Inside non-abstract method");
	 }

}
