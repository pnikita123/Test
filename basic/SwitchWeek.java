package basic;

import java.util.Scanner;

public class SwitchWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc=new Scanner(System.in);
		
		do {
			
		System.out.println("Enter The Day :" );
		ch=sc.next().charAt(0);
		
       switch(ch){
       case 1:System.out.println("It's Monday" );
       break;
       case 2:System.out.println("It's Tuesday" );
       break;
       case 3:System.out.println("It's Wednesday" );
       break;
       case 4:System.out.println("It's Thirsday" );
       break;
       case 5:System.out.println("It's Friday" );
       break;
       case 6:System.out.println("It's Saturday" );
       break;
       case 7:System.out.println("It's Sunday" );
       break;
       default :System.out.println("Invalid" );
       }
       System.out.println("Do u Want to Continue(yes/no)" );
	   ch=sc.next().charAt(0);
       }
		while(ch=='y' || ch=='n');
	}
}

