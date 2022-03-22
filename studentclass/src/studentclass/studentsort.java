package studentclass;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class studentsort {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		student stud1=new student("aishu","123","9346839106");
		student stud2=new student("bharu","456","4567854546");
		student stud3=new student("sanju","567","9542974876");
		student stud4=new student("dhana","678","9000308425");
		student stud5=new student("aashu","987","9346839107");
		stud1.setgrade(67);
		stud2.setgrade(54);
		stud3.setgrade(38);
		stud4.setgrade(92);
		stud5.setgrade(48);
		List<student>allstudents=new LinkedList<student>();
		allstudents.add(stud1);
		allstudents.add(stud2);
		allstudents.add(stud3);
		allstudents.add(stud4);
		allstudents.add(stud5);
		Collections.sort(allstudents,new NewComparator());
		for(student s : allstudents) {
			System.out.println("student name:"+s.studname);
			System.out.println("student id:"+s.studid);
			System.out.println("student number:"+s.studnum);
			System.out.println("grade:"+s.getGrade());
			
		}
	}
}



