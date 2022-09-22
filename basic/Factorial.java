package basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1;
		int num;
		System.out.println("Enter the No:"  );
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial Of " +num+ " is:"+fact );

	}

}
