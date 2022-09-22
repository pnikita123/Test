package basic;

import java.util.Scanner;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

public class EvenOdd {

	public static void main(String[] args) { //throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Number :");
		num=sc.nextInt();
		//num=Integer.parseInt(br.readLine());
		if(num % 2 == 0)
			System.out.println("The Number is Even");
		else
			System.out.println("The Number is Odd :");
			


	}

}
