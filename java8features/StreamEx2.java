package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("anee","Nikita","minaj","vbijuhgfd");
		List<String> longName=names.stream().filter(str -> str.length()<6 && str.length()<11).collect(Collectors.toList());
		longName.forEach(str -> System.out.println(str));//System.out::println

	}

}
