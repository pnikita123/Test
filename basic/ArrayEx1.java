package basic;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          /* int a[]= {1,2,3,4,5};
           for(int i=0;i<a.length;i++)
           {
        	   System.out.println(a[i]);
         }*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("Array is :");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i] );
		}
		
	}

}

