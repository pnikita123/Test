package exception;

public class BadFoodException {
	public static void badfood(String name)
	{
		String mango;
		//if(mango)
			System.out.println("I like mango");
		//else
			throw new ArithmeticException("I dont like FruitsName");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//badfood(mango);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("rest of the code....");
	}
}
