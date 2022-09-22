package basic;

import java.util.Scanner;

public class ArraySwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,temp;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements you want in the array: ");
        size = sc.nextInt();
    
        int a[] = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) 
        {
            a[i] = sc.nextInt();
        }
      
        for (int i = 0; i < size-1; i++) 
        {
            for (int j = i + 1; j < size; j++) { 
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < size - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[size - 1]);

	}

}
