package basic;

import java.util.Scanner;

public class ArrayHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array " );
		size=sc.nextInt();
		int a[]=new int[size];
		int max = a[0];
		int min = a[0];
		System.out.println("enter "+size+" array element :");
		for(i=1;i<a.length;i++)
			a[i]=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			else if (a[i]<min)                                                                     
				min=a[i];
		}
		System.out.println("Higest Array :" +max);
		System.out.println("Lowest Array :" +min);
	}

}