package string;
import java.util.Scanner;
public class VowelsConsonents {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Count1 = 0, Count2 = 0;   
		String str ;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a string : "); 
		 str = sc.nextLine(); 
		 str = str.toLowerCase();    
		 for(int i = 0; i < str.length(); i++)	 
		 {
			 if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
			 {    
	                Count1++;    
		     }
			 else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {            
	                Count2++;    
	            }    
	      }
		    System.out.println("Number of vowels : " + Count1);    
		    System.out.println("Number of consonants: " + Count2); 
   }
}
