package inheritance;

import java.util.function.Consumer;

public class consumer {
	public static void main(String args[]) {
		Consumer <Integer> c=(b)->
		{
			int a=  b/2;
			
		};
     c.accept(10);
     System.out.println(c);
		
	}
}
