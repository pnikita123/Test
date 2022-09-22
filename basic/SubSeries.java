package basic;

import java.util.Scanner;

public class SubSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,sum=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range of number=");
		n=sc.nextInt();
		while(i<=n)
		{
			System.out.print(+(i)+"-"+(i+1));
			if(i<n)
			System.out.print(" + ");
			 i++;
			sum=sum+(i-i);
					
		}
		System.out.println(" = " +sum);


	}

}
