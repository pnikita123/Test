package classandobject;

public class StaticMethodEx {
	public static void add(int a,int b)
	{
		System.out.println("add :" +(a+b));
	}
	public static void add(int a,int b,int c)
	{
		System.out.println("add :" +(a+b+c));
	}
	static {
		System.out.println("It will call before" );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodEx.add(12, 34);
	}

}
