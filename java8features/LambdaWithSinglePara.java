package java8features;

public class LambdaWithSinglePara {
@FunctionalInterface
	interface Sayable1{
		String say(String str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable1 s1=(name) ->{
			return "Hello"+name;
		};
		System.out.println(s1.say("Nikita"));
		

	}

}
