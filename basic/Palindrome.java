package basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,r,sum=0,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number=" );
		n=sc.nextInt();
		s=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
	     	n=n/10;	
		}
		if(s==sum)
		System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome" );

	}

}
