package inheritance;

import java.util.Scanner;

public class Grade {
private char grade;
char[]possibleValues=new char[] {'A','B','C','D'};
public void setGrade()throws Exception {
	System.out.println("enter the grade");
	Scanner sc=new Scanner(System.in);
	this.grade=sc.next().charAt(0);
	for(char c:possibleValues) {
		if(this.grade==c) {
			return;
		}
	}
	throw new Exception("exception occured");
}
public String getGrade() {
	// TODO Auto-generated method stub
	return null;
}

}
