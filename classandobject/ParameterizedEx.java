package classandobject;

import java.util.Scanner;

public class ParameterizedEx {
	public void add(int a,int b)
	{
	   System.out.println("Addition ="+(a+b));
	}
	public int sub(int a,int b)
	{
	   return a-b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedEx p1=new ParameterizedEx();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers = ");
		int p=sc.nextInt();
		int q=sc.nextInt();
		
		p1.add(p, q);
		int r=p1.sub(p, q);
		System.out.println("Substraction = "+r);
	}

}
