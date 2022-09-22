package java8features;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {21,33,1,23,45,67,4};
		System.out.println("Before sorting");
		for(int i:a)
		{
			System.out.println(i+" ");
			
		}
		//Array.parallelsort(a);  //sorting array
		Arrays.parallelSort(a,0,6);
		System.out.println("\n\nAftre sorting");
		for(int i:a)
		{
			System.out.println(i+" ");
			
		}
		
		

	}

}
