package string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Welcome",s2="Hello",s3="welcome",s4="  Welcome to Edubridge  ";
		System.out.println("charAt(3) :" +s1.charAt(3));
		System.out.println("length :" + s2.length());
		System.out.println("substring :" +s1.substring(3));
		System.out.println("contains :" + s1.contains("e"));
		System.out.println("contains :" + s1.contains("x"));
		System.out.println("equal :" +  s3.equals(s2));
		System.out.println("equalsIgnoreCase :" +  s1.equalsIgnoreCase(s3));
		System.out.println("equalsIgnoreCase :" +  s1.equalsIgnoreCase("Welcome"));
		System.out.println("isEmpty :" +   s1.isEmpty());
		System.out.println("indexOf :" +  s1.indexOf('e'));
		System.out.println("indexOf :" +   s1.indexOf('e',2));
		System.out.println("concat :" +   s2.concat("Nikit"));
		System.out.println("replace :" +    s1.replace('e', 'a'));
		System.out.println("toUpperCase :" +    s2.toUpperCase());
		System.out.println("toLowerCase :" +   s3.toLowerCase());
		System.out.println("length :" +    s4.length());
		System.out.println("trim :" +    s4.trim());
		System.out.println("concat :" +   s2.concat("Nikit"));
		System.out.println("concat :" +   s2.concat("Nikit"));
        String s5="This is example of split";
        String splitedString[]=s5.split(" ");
        for(int i=0;i<splitedString.length;i++)
        {
        	System.out.println(splitedString[i]);
        }
        
	}

}
