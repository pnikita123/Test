package classandobject;

public class OverloadArea {
	private static final float PI = 0;

	public void Area(float r)
    {
        double A = PI * r * r;
 
        System.out.println("Area of the circle is :" + A);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadArea o=new OverloadArea();
		o.Area(6);

	}

}
