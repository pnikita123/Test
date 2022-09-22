package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreatestNumber {

	public static void main(String[] args)throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int x,y,z;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Number :");
		x=Integer.parseInt(br.readLine());
		y=Integer.parseInt(br.readLine());
		z=Integer.parseInt(br.readLine());
		if(x>y && x>z)
		{
			System.out.println("Greater no is :" +x);

		}
		else if (y>x && y>z) 
		{
			System.out.println("Greater no is :" +y);

		}
		else 
		{
			System.out.println("Greater no is :" +z);
			
		}

	}

}
