package exception;

public class FinallyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("case 1: where exception doesnt occurs");

		try {
			int c=10/5;
			System.out.println(c);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("case 1: It is always executed");

		}
		System.out.println("case 1: rest of code");
		System.out.println("\ncase 2: where exception occurs and handled");
		
		try {
			int a[]=new int[5];
	       	 a[7]=10/0;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("case 2: It is always executed");

		}
		System.out.println("case 2: rest of code");
		System.out.println("\ncase 2: where exception occurs and doesn't handled");
		
		try {
			String s=null;
			System.out.println(s.length());
	     
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("case 3: It is always executed");
		}
		System.out.println("case 3: rest of code....");

	}

}
