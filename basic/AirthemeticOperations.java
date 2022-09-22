package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class AirthemeticOperations {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		int a,b,c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the two no :");
		//Scanner sc= new Scanner(System.in);
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c=a+b;
		System.out.println("Addition :"+c );
		
		System.out.println("enter the two no :");
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c=a-b;
	    System.out.println("Substraction :"+c );
	
	
	    System.out.println("enter the two no :");
	    a = Integer.parseInt(br.readLine());
	    b = Integer.parseInt(br.readLine());
	    c=a*b;
        System.out.println("Multiplication :"+c );


        System.out.println("enter the two no :");
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c=a/b;
        System.out.println("Division :"+c );


	}

}
