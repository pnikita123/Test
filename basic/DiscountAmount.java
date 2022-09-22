package basic;

import java.util.Scanner;

public class DiscountAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double quantity,price,amount,discount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price of product ");
		price=sc.nextDouble();
		System.out.println("Enter the no of quantity  ");
		quantity=sc.nextDouble();
		amount=quantity*price;
		
		if(amount>=10000)

		{
			discount=amount*0.02;
			amount=amount-discount;
		}
		System.out.println("The total Amount is " +amount);

	}

}
