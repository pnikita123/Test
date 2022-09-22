package java8features;

public class LambdaWithMultiPara {
	@FunctionalInterface
	interface Addable{
		int add(int a,int b);
	}
	
	public static void main(String[]args) {
		Addable ad1=(x,y) ->{
			return x+y;
			
		};
		Addable ad2=(p,q) -> p+q;
		
		System.out.println("add :"+ad1.add(12,5));
		System.out.println("add :"+ad2.add(12,5));
	}

}
