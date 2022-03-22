package inheritance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamdemo {
	public static void main(String args[]) {
		List<Integer> integers=Arrays.asList(4,3,6,5,8);
		Stream<Integer> stream=integers.stream();
		//stream.filter(num-> num%2!=0).forEach(val->System.out.println(val));
		//Stream<Integer> stream1=integers.stream();
		//stream1.map(i->i*i).forEach(data->System.out.println(data));
		//for(int a:integers) {
			//System.out.println(a);
		//}
		//stream.map(i->i+(i*10/100)).forEach(data->System.out.println(data));
		stream.sorted().forEach(System.out::println);
	}

}
