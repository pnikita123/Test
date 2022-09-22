package string;

public class AutoBoxingEx {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		Integer b=a;
		Integer c=Integer.valueOf(a);
		
		System.out.println("Autoboxing :" +a +" "+b+" " +c);
		Integer x=new Integer(20);
		int y=x;
		int z=x;

	}

}
