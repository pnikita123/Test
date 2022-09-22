package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grade {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		int a, b, c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The 3 Subject Number :");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		c=Integer.parseInt(br.readLine());
		int ans=a+b+c;
		double per=ans/3;
		if(a<35 || b<35 || c<35)
		{
			System.out.println(" Fail ");

		}
		else if(per>=70) {
			System.out.println("Destinction " +per+ "%");

		}
		else if(per>=60) {
			System.out.println("First Class " +per+ "%");

		}
		else if(per>=55) {
			System.out.println("Second Class " +per+ "%");

		}
		else if(per>=45) {
			System.out.println("Pass Class " +per+ "%");

		}


	}

}
