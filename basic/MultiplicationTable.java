package basic;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the No:"  );
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=1;i<=10;++i)
		{
			System.out.println(n + "*" +i + "=" + n * i);
		}

	}

}
