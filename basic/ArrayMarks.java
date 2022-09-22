package basic;

import java.util.Scanner;

public class ArrayMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x,y,temp,size;
		//Scanner sc = new Scanner(System.in);
       // System.out.print("Enter the RollNo : ");
       // x = sc.nextInt();
        //System.out.print("Enter the Marks : ");
        //x = sc.nextInt();
		int temp;
		 int a[]= {1,2,3,4,5};
		 int b[]= {65,58,89,42,76};
        //size=sc.nextInt();
        //int a[] = new int[size];
       // System.out.println("Enter array elements:");
        for (int i = 0; i <a.length-1; i++) 
        {
           // a[i] = sc.nextInt();
        }
        
        for (int i = 0; i <a.length; i++) 
        	for(int j = a.length/2;j< a.length-1; j++)
            {
                if(a[j] < a[j+1])
                {
                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
                }
             }
            
        System.out.print("Array Elements Descending Order: ");
        for(int i = 0; i <a.length; i++)
            System.out.print(a[i] + " ");
	}
    

	

}
