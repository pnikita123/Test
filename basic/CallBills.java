package basic;

import java.util.Scanner;

public class CallBills {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int call,billpay;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of calls ");
		call=sc.nextInt();
		if(call<200)
		{
			billpay=call*1;
			System.out.println("Bill is "+billpay);
		}
		else if(call>200)
		{
			billpay=call*3;
			System.out.println("Bill is "+billpay);
		}

	}

}
