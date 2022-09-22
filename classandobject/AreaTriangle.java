package classandobject;

public class AreaTriangle {
	long b;
	long h;
	public  AreaTriangle()//default constructor
	{
		b=12;
		h=6;
		
	}
	
	
	public AreaTriangle(long b, long h) {
		super();
		this.b = b;
		this.h = h;
	}


	public void area()
	{
		System.out.println("Area of Triangle :"+(b*h)/2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaTriangle a1=new AreaTriangle();
				a1.area();
		AreaTriangle a2=new AreaTriangle(12,5);
				a2.area();		
		

	}

}
