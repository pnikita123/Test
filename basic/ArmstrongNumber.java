package basic;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r,sum=0,s,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number=" );
		n=sc.nextInt();
		s=n;
		while(n>0)
		{
			count++;
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		System.out.println(count);
		if(s==sum)
			System.out.println("Armstrong Number");
			else
			System.out.println("Not Armstrong Number" );


	}

}
