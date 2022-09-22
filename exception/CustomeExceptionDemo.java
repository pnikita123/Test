package exception;

public class CustomeExceptionDemo {
	public static void validate(int age) {
	
	if(age>=18)
		System.out.println("wlcome to vote");
	else
		throw new ArithmeticException(" not valid");
	}

	public static void main(String[] args) {
		validate(10);
		System.out.println("rest of the code....");
	}

}
