package inheritance;

public class exceptiondemo {
	public static void main(String args[]) {
		Grade grade=new Grade();
		try {
			grade.setGrade();
			System.out.println("grade is"+grade.getGrade());
			
		}
		catch(Exception e) {
			System.out.println("grade value not allowed");
			System.out.println(e.getMessage());
			
		}
	}
		
	}

