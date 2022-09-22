package abstraction;

public class Honda extends Bike {
	
public void run() {
	System.out.println("Running safely");
}
public static void main(String[] args) {
	Honda h=new Honda();
	h.run();
	h.display();
}
}
