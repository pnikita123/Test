package classandobject;

public class ThisConstructor {
	String str;
	public ThisConstructor()
	{
		this("Hello World");
	}
	public ThisConstructor(String str)
	{
		this.str=str;
	}
	public void display()
	{
		System.out.println(str);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConstructor t=new ThisConstructor();
		t.display();

	}
}
