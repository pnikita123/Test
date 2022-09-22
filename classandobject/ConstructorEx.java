package classandobject;

public class ConstructorEx {
	int l,b; //instance variable
	public  ConstructorEx()//default constructor
	{
		l=12;
		b=6;
	}
	/*public ConstructorEx(int length,int breadth) // parameterized constructor//local variable
	{
		l=length;
		b=breadth;
	}*/
	public ConstructorEx(int l,int b) //local variable
	{
		this.l=l;
		this.b=b;
	}
	
	public void area()
	{
		System.out.println("Area of rectangle :"+(l*b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx c1=new ConstructorEx();
		c1.area();
		
		ConstructorEx c2=new ConstructorEx(12,3);
		c2.area();

	}

}
