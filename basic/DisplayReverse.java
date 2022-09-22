package basic;

import java.util.Scanner;

public class DisplayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number=" );
		n=sc.nextInt();
		
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		System.out.println("Reverse Number is : "+sum );
		

	}

}
