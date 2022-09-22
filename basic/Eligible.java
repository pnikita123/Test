package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eligible {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		int age;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Age :");
		age=Integer.parseInt(br.readLine());
		if(age>=18)
		{
			System.out.println(" You are eligible for licence");
		}
		else
		{
			System.out.println("You are not eligible for licence");
		}
		

	}

}
