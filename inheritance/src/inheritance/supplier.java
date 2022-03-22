package inheritance;

import java.util.function.Supplier;

public class supplier {
	public static void main(String args[]) {
		Supplier <Integer> s=() ->((int)(Math.random()*100));
		System.out.println(s.get());
			

		}
}
