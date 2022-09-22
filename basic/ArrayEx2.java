package basic;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter array size");
		n=sc.nextInt();
		System.out.println("plz type array values");
		int array[]=new int[n];
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Array :");
		for(int i=0;i<array.length;i++) {
			System.out.print(" "+array[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int size,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array " );
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter "+size+" array element :");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array :" );
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i] );
		}*/

	}

}
