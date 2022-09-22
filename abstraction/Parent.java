package abstraction;

abstract  class Parentc {
	public abstract void message();
}
class Subclass1 extends Parentc{
	  @Override
	  public void message() {

	   System.out.println("This is First subclass.");
	   }
	}
class Subclass2 extends Parentc{

	 @Override
	  public void message() {

	   System.out.println("This is second subclass.");
	   }
}
public class Parent{

	   public static void main(String args[]) 
	   {
	   Subclass1 sb1 = new Subclass1();
	   Subclass2 sb2 = new Subclass2();
	   sb1.message();
	   sb2.message();
	    }
	}
	
