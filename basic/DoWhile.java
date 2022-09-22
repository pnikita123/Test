package basic;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		char ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter the 2 Number=" );
			a=sc.nextInt();
			b=sc.nextInt();
			c=a+b;
			System.out.println("Addition "+c );
			System.out.println("Do u Want to Continue(yes/no)" );
			ch=sc.next().charAt(0);
			
		}
		while(ch=='y' || ch=='n');
			

	}

}
