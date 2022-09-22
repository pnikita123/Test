package basic;
import java.util.Scanner;
public class Mileage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
        m = sc.nextInt();

        if(100>m){
            System.out.println("The Given Number is too Small..");
        }
        if(100<=m && 125>=m){
            System.out.println(75);
        }
        if(126<=m && 135>=m){
            System.out.println(70);
        }
        if(136<=m && 150>=m){
            System.out.println(60);
        }
        if(151<=m && 200>=m){
            System.out.println(50);
        }
        if(201<=m && 220>=m){
            System.out.println(35);
        }
        if(m>220){
            System.out.println(" The Given Number is too Large..");
        }
    
	}

}
