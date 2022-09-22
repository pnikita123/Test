package classandobject;

public class EmployeeOverloading {
	
	int id,workingDay,perDay,calculateSalary;
	String name;
	public EmployeeOverloading()
	{
		id=1;
		name="Nikita";
		workingDay=20;
		perDay=500;
	}
	
	public EmployeeOverloading(int id,String name,int workingDay,int perDay)
	{
		this.id=id;
		this.name=name;
		this.workingDay=workingDay;
		this.perDay=perDay;
	}
	
	public void salary()
	{
		calculateSalary=workingDay*perDay;
		System.out.println("Salary is :"+calculateSalary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeOverloading e1=new EmployeeOverloading();
		e1.salary();
		EmployeeOverloading e2=new EmployeeOverloading( 2,"Ankita",12,500);
		e2.salary();
		

	}

}
