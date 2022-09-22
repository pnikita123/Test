package basic;
import java.util.Scanner;
public class SwitchArithmetic {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		char ch;
		Scanner sc=new Scanner(System.in);
		
		do {
		System.out.println("Enter The Two No :" );
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter ur Choice . \n +for addition  \n -for substraction  \n *for multiplication  \n /for division" );
		ch=sc.next().charAt(0);

		switch(ch){
		case '+' : System.out.println("Add= " +(a+b));
		break;
		case '-' : System.out.println("Add= " +(a-b));
		break;
		case '*' : System.out.println("Add= " +(a*b));
		break;
		case '/' : System.out.println("Add= " +(a/b));
		break;
		default : System.out.println("Invalid choice");
		}
		System.out.println("Do u Want to Continue(yes/no)" );
		ch=sc.next().charAt(0);
		}
		while(ch=='y' || ch=='n');
	}
}
