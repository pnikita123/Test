package basic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=1,num3,n;
		System.out.println("Enter the Fibonacci No:"  );
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(num1+" "+num2+" " );
		
		for(int i=2;i<=n;i++)
		{
			num3=num1+num2;
			System.out.println(" "+num3 );
			num1=num2;
			num2=num3;
		}	
	}
}
