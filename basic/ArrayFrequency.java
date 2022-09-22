package basic;
import java.util.Scanner;
public class ArrayFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,countx=0, county=0, countz=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array " );
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter "+size+" array element :");
		for(i=0;i<a.length;i++)
			a[i]=sc.nextInt();
	
			for(i=0;i<a.length;i++){
				if(a[i]<0)
		            countx++;
		         else if(a[i]>0)
		            county++;
		         else
		            countz++;
			}
			  System.out.println("\nFrequency Positive Number: " +countx);
		      System.out.println("Frequency Negative Number: " +county);
		      System.out.println("Total Zero: " +countz);
	}
}
