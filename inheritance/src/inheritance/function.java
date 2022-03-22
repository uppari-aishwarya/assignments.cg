package inheritance;

import java.util.function.Function;

public class function {
	public static void main(String args[]) {
		Function f=(a)->{
			int b=(int)a/2;
			return b;
			
		};
		
		int pass =(int)f.apply(100);
		System.out.println(pass);
	}
	
	}


