package basic;

import java.util.Scanner;

public class AreaCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//area of circle
		double pi=3.14f,c;
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius=");
		r=sc.nextInt();
		c=pi*r*r;
		System.out.println("Area of circle =" +c);
		
		//area of rectangle
		System.out.println("Enter the length of recctangle=");
		double l=sc.nextDouble();
		System.out.println("Enter the width of recctangle=");
		double w=sc.nextDouble();
		double a=l*w;
		System.out.println("Area of rectangle =" +a);
		
		//area of triangle
		System.out.println("Enter the width of triangle=");
		double b=sc.nextDouble();
		System.out.println("Enter the height triangle=");
		double h=sc.nextDouble();
		double t=(b*h)/2;
		System.out.println("Area of triangle =" +t);
	}

}
