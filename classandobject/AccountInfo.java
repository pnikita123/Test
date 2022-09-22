package classandobject;
import java.util.Scanner;
public class AccountInfo {
	String name;
	double principle,number,rate,a,m,l;
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name of Depositors = ");
        name = sc.next();
        System.out.print("Enter The Principle Amount = ");
        principle = sc.nextDouble();
        System.out.print("Enter The Years = ");
        number = sc.nextDouble();
	}
	public void amount()
	{
		if(number<1){
			rate=(double) 9;
			m=(1+rate/100);
			a=Math.pow(m, number);
		}
		else if(number>=1 && number<=3){
			rate=(double) 9.25;
			m=(1+rate/100);
			a=Math.pow(m, number);
		}
		else if(number>=3 && number<=5){
			rate=(double) 9.5;
			m=(1+rate/100);
			a=Math.pow(m, number);
		}
		else{
			rate=(double) 9.75;
			m=(1+rate/100);
			a=Math.pow(m, number);
		} 
		 l=principle*a;
		    System.out.println("\nName of Depositors = " +name);
			System.out.println("\nPrinciple Amount = " +principle);
			System.out.println("\nDuration = " +number);
			System.out.println("\nRate of Interest for "+number+" year is = " +rate);
			System.out.println("\nAccumulated Amount = " +l);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountInfo ac=new AccountInfo();
		ac.accept();
		ac.amount();
	}
}















