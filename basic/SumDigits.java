package basic;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number=" );
		n=sc.nextInt();
		
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("Sum Of Digit is : "+sum );
	}
}
