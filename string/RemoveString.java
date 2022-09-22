package string;

import java.util.Scanner;

public class RemoveString
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String a,ab;
		int n;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a string : "); 
		 a = sc.nextLine(); 
		 System.out.println("Enter number u want to remove : ");
		 n=sc.nextInt();
		 ab=a.substring(0,n-1)+a.substring(n,a.length());
		 System.out.println("Removing After Char Final String is : " +ab);
		 
	}

}
