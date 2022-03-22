package inheritance;

public class LambdaDemo {
	public static void main(String args[]) {
	
		/*DemoInterface d=(a,b,c) ->{
			System.out.println("avg is:"+(a+b+c)/3);
		};
		d.show(10,20,30);
		d.show(10, 40, 60);*/
		arrayavginterface d=(a)->{
			float sum=0;
			for(int i=0;i<a.length;i++) {
				System.out.println("num is:"+a[i]);
			  sum = sum+a[i];
			}
					
			System.out.println("the sum of elements  is"+sum);
			System.out.println("the avg of elements  is"+sum/a.length);
			
			
			};
			int [] num= {2,3,4,5};
			int [] num1= {4,3,5,11};
			d.display(num);
			d.display(num1);
		}
			}
	
		
	


