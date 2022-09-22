package abstraction;

import java.util.Scanner;

abstract class Bank{
	public abstract float getRateOfInterest();
}

class SBI extends  Bank{

	@Override
	public float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 6.4f;
	}
	
}
class ICICI extends  Bank{

	@Override
	public float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 7.4f;
	}

}

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle amount ");
		float pAmount=sc.nextFloat();
		System.out.println("Enter Years ");
		float n=sc.nextFloat();
		
		Bank b,b1;
		b=new SBI();
		b1=new ICICI();
		float rSbi=b.getRateOfInterest();
		float eIcici=b1.getRateOfInterest();
		System.out.println("simple Interest for Sbi" +(pAmount*n*rSbi/100));
		System.out.println("simple Interest for ICIC " +(pAmount*n*eIcici/100) );
		


	}

}
