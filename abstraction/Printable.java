package abstraction;

public interface Printable {
	float PI=3.14f;//public static final
	void calculate();//public abstract
	
	static int cube(int a)
	{
		return a*a*a;
	}
	default void square(int x)
	{
		System.out.println("Square :" +(x*x));
	}

}
