package string;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 String str;
		 int count = 1;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a string : "); 
		 str = sc.nextLine(); 
		 for (int i = 0; i < str.length() - 1; i++)
		 {
			 if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
	            {
	                count++;
	            }
		 }
		 System.out.println("Number of words in a string : " + count);
	}
}
