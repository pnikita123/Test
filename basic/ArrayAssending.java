package basic;

import java.util.Scanner;

public class ArrayAssending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,temp;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements you want in the array: ");
        size = sc.nextInt();
    
        int a[] = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size-1; i++) 
        {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < size; i++) 
        	for(int j = 0;j < size/2; j++) 
        	{ if(a[j]>a[j+1])
            {
              temp=a[j];
              a[j]=a[j+1];
              a[j+1]=temp;
            }
        }
        for(int j = size/2;j< size-1; j++)
        {
            if(a[j] < a[j+1])
            {
               temp=a[j];
               a[j]=a[j+1];
               a[j+1]=temp;
            }
         }
        System.out.print("Array Elements in Ascending & Descending Order: ");
        for(int i = 0; i < size; i++)
            System.out.print(a[i] + " ");
	}

}
