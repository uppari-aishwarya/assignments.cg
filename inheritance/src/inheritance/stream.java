package inheritance;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class stream {
	public static void main(String args[] ){
		List<String> strings=Arrays.asList("chinu","aishu","sanju","","bharu");
		Stream<String> stream=strings.stream();
		//long counter=stream.filter(str-> str.equals("")).count();
		//System.out.println("total empty strings are:" +counter);
		//stream.filter(str-> !str.equals("")).forEach(name->System.out.println(name));
		// boolean val=stream.anyMatch(s->s.startsWith("a"));
		//System.out.println(val);
		Optional<String>newString=stream.reduce((s1,s2)->s1+","+s2);
		newString.ifPresent(System.out::println);
	}

}
