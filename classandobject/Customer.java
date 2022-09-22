package classandobject;
import java.util.Scanner;

public class Customer {
	 int call,phone;
     String name,phno;
     double amt;
     double total;
     
     public void accept() {
         Scanner in = new Scanner(System.in);
         System.out.print("Enter Customer Name: ");
         name = in.nextLine();
         System.out.print("Enter the phone no: ");
         phno = in.nextLine();
         System.out.print("Enter call from user: ");
         call = in.nextInt();
     }
    
     public void cal() {
         call = call- phone;
         if (call <= 100)
             amt = 0;
         else if (phone <= 200)
             amt = (phone - 100) * 0.9;
         else if (phone <= 400)
             amt = (100 * 0.9) + (phone - 200) * 0.8;
         else
             amt = (100 * 0.9) + (200 * 0.8) + ((phone - 400) * 0.7);
             
         total = amt + 180;
     }
     
     public void display() {
         System.out.println("Name of the customer\tCalls made\tAmount to be paid");
         System.out.println(name + "\t" + phone + "\t" + total);
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer obj = new Customer();
        obj.accept();
        obj.cal();
        obj.display();

	}

}
