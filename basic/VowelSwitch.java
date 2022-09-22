package basic;
import java.util.Scanner;
public class VowelSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Character :" );
		ch=sc.next().charAt(0);
		
		switch(ch){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':System.out.println(ch+ " Is a Vowel." );
		break;
		default:System.out.println(ch+ " Is a Consonant." );		
		}
	}
}
