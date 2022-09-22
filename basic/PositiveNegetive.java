package basic;

import java.util.Scanner;

public class PositiveNegetive {

	public static void main(String[] args) { //throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		/*int num;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Number :");
		num=Integer.parseInt(br.readLine());
		if (num>0)
		{
			System.out.println("Number Is Positive");
		}
		else if(num<0)
		{
			System.out.println("Number Is Negative");
		}
		else
		{
			System.out.println("Number Is Zero");
		}*/

		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("ener no");
		i=sc.nextInt();
		if(i>0) {
			System.out.println("Number Is Positive");
		}
		else if(i<0) {
			System.out.println("Number Is Negative");
		}
		else {
			System.out.println("Number Is Zero");
		}
			
	}

}
