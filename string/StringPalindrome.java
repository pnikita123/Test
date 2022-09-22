package string;
import java.util.Scanner;
public class StringPalindrome {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		  String name, reverse = "";  
	      Scanner sc  = new Scanner(System.in);   
	      System.out.println("Enter a string : ");  
	      name = sc.nextLine();   
	      int l = name.length();   
	      for ( int i = l-1; i >= 0; i--)
	      {
	         reverse = reverse + name.charAt(i); 
	      }
	      if (name.equals(reverse)) 
	      { 
	         System.out.println("String is a palindrome."); 
	      }
	      else {  
	         System.out.println("String is not palindrome.");
	      }
	}
}
