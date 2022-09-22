package basic;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int size,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array " );
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter "+size+" array element :");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();	
		}
		for(i=0;i<a.length;i++)
			sum=sum+a[i];
		
		//System.out.println(a[i] );
		System.out.println("sum of the element of  Array :" +sum );*/
		//int i;
		System.out.println("Enter array size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
	 System.out.println(+a[i]);
		}
		
	}

}
