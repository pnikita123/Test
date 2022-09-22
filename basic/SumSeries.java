package basic;

import java.util.Scanner;

public class SumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,n,mul=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range of number=");
		n=sc.nextInt(); 
		while(mul<=n)
	        {
			System.out.print(+mul+"/"+mul+"!");
			if(mul<n)
				System.out.print(" + ");
			      mul++;
	            sum = sum +(mul/mul*mul);
	            mul--;
	        }
		System.out.print(" = " +sum);

	}

}
