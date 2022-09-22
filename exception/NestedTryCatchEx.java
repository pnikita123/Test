package exception;

public class NestedTryCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				String s = null;
				System.out.println(s.length());
			} catch (NullPointerException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				String s = "abd";
				System.out.println(Integer.parseInt(s));

				
			} catch (NumberFormatException e) {
				System.out.println(e);
			}
			System.out.println("other statement");

			
		} catch (Exception  e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("\n rest of code");	
		}

	

}
