package basic;
import java.util.Scanner;

public class ScanerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("enter the two no :");
		Scanner sc= new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			c=a+b;
		System.out.println("Answer :"+c );
		
		System.out.println("enter the two no :");
	
		a = sc.nextInt();
		b = sc.nextInt();
		c=a-b;
	System.out.println("Answer :"+c );
	
	
	System.out.println("enter the two no :");
	a = sc.nextInt();
	b = sc.nextInt();
	c=a*b;
System.out.println("Answer :"+c );


System.out.println("enter the two no :");

a = sc.nextInt();
b = sc.nextInt();
c=a/b;
System.out.println("Answer :"+c );




	


	}

}
