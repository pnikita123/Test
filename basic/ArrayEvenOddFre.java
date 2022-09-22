package basic;
import java.util.Scanner;
public class ArrayEvenOddFre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,b=0,i,size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array " );
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter "+size+" array element :");
		for(i=0;i<a.length;i++)
			a[i]=sc.nextInt();
	
			for(i=0;i<a.length;i++){
				if(a[i]%2==0)
					x++;
				else 
					b++;
			}
			System.out.println("\nFrequency of even Number: " +x);
		    System.out.println("Frequency of odd Number: " +b);
	}
}
