package classandobject;

import java.util.Scanner;

public class Employee {
	int emp_code,salary; 
	int allowance,grossSalary;
	int tax,netSalary;
	String name;  
	
	public void accept() {
         Scanner in = new Scanner(System.in);
         System.out.print("Enter employee Name: ");
         name = in.nextLine();
         System.out.print("Enter code: ");
         emp_code = in.nextInt();
         System.out.print("Enter Basic Salary: ");
         salary = in.nextInt();
     }
	public void allow()
	{
		allowance=(55*salary)/100;
		
	}
	public void gross()
	{
		grossSalary=salary+allowance;
		
	}
	public void tax(){
		tax=(12*grossSalary-salary);
		
	}
	
	public void display()
	{
		
		System.out.println("Enter employee Name = " +name);
		System.out.println("Enter employee code = " +emp_code);
		System.out.println("Basic Salary = " +salary);
		System.out.println("Tax = " +tax);
		System.out.println("Net salary = " +netSalary);

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee();
        obj.accept();
        obj.allow();
        obj.gross();
        obj.tax();
        obj.display();
	}

}
