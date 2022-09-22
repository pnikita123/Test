package string;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2;
		int length = 0; 
		boolean ans;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter first string : "); 
		 str1 = sc.nextLine();
		 System.out.println("Enter second string : "); 
		 str2 = sc.nextLine();
		 str1=str1.toLowerCase();
		 str2=str2.toLowerCase();
		 char[] charArray1=str1.toCharArray();
		 char[] charArray2=str1.toCharArray();
         Arrays.sort(charArray1);
         Arrays.sort(charArray2);
         ans=Arrays.equals(charArray1, charArray2);
         if(ans) {
        	 System.out.println("Anagram String are  "+str1+" and "+str2);
         }
         else {
        	 System.out.println("This is not Anagram String ");
         }      
	}
}
