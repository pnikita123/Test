package basic;
import java.util.Scanner;
public class ArrayCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,evesum=0,oddsum=0,evencount=0,oddcount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array " );
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter "+size+" array element :");
		for(i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++){
			if(a[i] % 2== 0) {
				evesum=evesum+a[i];
				evencount++;	
			}
			else {
				oddsum=oddsum+a[i];
				oddcount++;
			}}
		double avgodd=oddsum/oddcount;  
		double avgeven=evesum/evencount;
		System.out.println("Average of the even no is: " +evesum);
		System.out.println("Average of the odd no is: " +oddsum);
	}
}
