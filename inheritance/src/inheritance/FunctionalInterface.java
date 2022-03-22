package inheritance;

import java.util.function.Predicate;

public class FunctionalInterface {
	public static void main(String args[]) {
		Predicate<Integer> p=(b)->{
			if(b>5) {
				return true;
			}
			else {
				return true;
			}
		};
		boolean pass=p.test(20);
		System.out.println(pass);
	}
}
		
		


