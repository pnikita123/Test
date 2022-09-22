package relationshipEx;

public class Employee {
	int id;
	String name;
	Address addr;
	MyDate dob;
	
	
	public  Employee()
	
	{
		id=1;
		name="Nikita";
		dob=new MyDate();
		addr= new Address();
	}
    public  Employee(int id,String name, Address addr,MyDate dob)
	
	{
    	this.id=id;
		this.name=name;
		this.dob=dob;
		this.addr=addr;
	}
	
    public void display()
	{
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		dob.display();
		addr.display();
	}
	
	

}
