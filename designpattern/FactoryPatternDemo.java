package designpattern;

interface Shape{
	void draw();//interface method public,,abstract

}
class Rectangle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("In rectanggle class: draccw()");
	}
	
}

class Circle implements Shape{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("In circle class: draw()");
	}
}

class Square implements Shape{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("In Square class: draw()");
	}
}
class ShapeFactory{
	public Shape getShape(String shapeType)
	{
		if(shapeType==null)
		{
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(shapeType.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		
		else if(shapeType.equalsIgnoreCase("Square"))
			return new Square();
		return null;
			
	}
}

public class FactoryPatternDemo {
	public static void main(String[] args) {
		
		ShapeFactory  shapeFactory =new ShapeFactory ();
		
		Shape shape1=shapeFactory.getShape("Circle");
		shape1.draw();
		
		Shape shape2=shapeFactory.getShape("Rectangle");
		shape2.draw();
		
		Shape shape3=shapeFactory.getShape("Square");
		shape3.draw();
		
		
		
		
		
		
		
		
	}

}
