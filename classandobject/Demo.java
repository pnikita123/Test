package classandobject;

import java.util.Scanner;

public class Demo {
	int a,b;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 no");
		a=sc.nextInt();
		b=sc.nextInt();
				
	}

	public void add()
	{
		int c=a+b;
		System.out.println("add:"+c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.accept();
		d.add();

	}

}
