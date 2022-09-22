package classandobject;

public class OverloadingEx {
	public void add(int a,int b,int c)
	{
		System.out.println("Add of numeric value :" +(a+b+c));
	}
	public float add(float x,float y)
	{
		return x+y;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingEx o=new OverloadingEx();
		o.add(5, 7, 9);
		float r=o.add(3.4f, 2.1f);
		//System.out.println("Add of decimal value :" +c);

	}

}
