package basic;
import java.util.Scanner;
public class SwitchCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter ur choice : \n Area of Circle. \n Area of Rectangle. \n Area of Triangle." );
		Scanner sc=new Scanner(System.in);
		String ch=sc.next();
		switch(ch){
		case "circle":System.out.println("Enter the Radius");
		int r=sc.nextInt();
		double pi=3.14f;
		System.out.println("Area of Circle is ="  +(pi*r*r));	
		break;
		case "rectangle":System.out.println("Enter the length & width");
		int l=sc.nextInt();
		int w=sc.nextInt();
		System.out.println("Area of Rectangle is ="  +(l*w));	
		break;
		case "triangle":System.out.println("Enter the height & base");
		int h=sc.nextInt();
		int b=sc.nextInt();
		double ans=(b*h)/2;
		System.out.println("Area of Triangle is ="  +ans);	
		break;
		default :System.out.println("Invalid");
		}}}


	


