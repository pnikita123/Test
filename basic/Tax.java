package basic;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary,tax;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary ");
		salary=sc.nextDouble();
		if(salary<25000)
		{
			tax=salary*0.10;
			System.out.println(" salary "+tax);
		}
		else
		{
			tax=salary*0.15;
			System.out.println(" salary "+tax);
		}
		

	}

}
