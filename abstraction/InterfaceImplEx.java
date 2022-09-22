package abstraction;

public class InterfaceImplEx implements Printable,Showable {
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show() from Showable interface");
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("calculate() from Printable interface");
		float r=10f;
		System.out.println("Area :" +(PI*r*r));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImplEx i=new InterfaceImplEx();
		i.show();
		i.calculate();
		i.square(4);
		System.out.println("Cube :" +Printable.cube(8));

	}
}
