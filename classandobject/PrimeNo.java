package classandobject;
import java.util.*;

public class PrimeNo {
	static boolean checkForPrime(int number)
	{
	boolean isItPrime = true;
	 
	if(number <= 1) 
	{
	isItPrime = false; 
	return isItPrime;
	}
	else
	{
	for (int i = 2; i<= number/2; i++) 
	{
	if ((number % i) == 0)
	{
	isItPrime = false;
	break;
	}
	} 
	return isItPrime;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter The Number :"); 
		int number = sc.nextInt();
		boolean isItPrime = checkForPrime(number);
		 
		if (isItPrime)
		{
		System.out.println(number+" Is a Prime Number.");
		}
		else 
		{
		System.out.println(number+" Is not a Prime Number.");
		}
	}
}
