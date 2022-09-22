package exception;

import basic.AirthemeticOperations;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
        	 int a=20/0;
        	 System.out.println(a);
         }catch(ArithmeticException e) {
        	 e.printStackTrace();
        	 
        	 
         }
         System.out.println("\n rest of code");
	}

}
