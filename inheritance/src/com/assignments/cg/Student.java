package com.assignments.cg;

public class Student {
	private String studId;
	private String studName;
	private String studDept;
	private int studMarks;
	
	
	public Student(String studId, String studName, String studDept,int studMarks) {
		this.studId = studId;
		this.studName = studName;
		this.studDept = studDept;
		this.studMarks = studMarks;
	}
	
	public boolean isEqual(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Student) {
			Student stud = (Student) obj;
			return ( (stud.studId.equals(this.studId)) && (stud.studName.equals(this.studName)) && (stud.studDept.equals(this.studDept))&& (stud.studMarks==this.studMarks) );
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash = 0;
		hash = 123*this.studMarks;
		return hash ;
	}
	
	public static void main(String[] args) {
		Student stud1 = new Student("18A01","aishu","cse",67);
		Student stud2 = new Student("18A02","sanju","eee",85);
		Student stud3 = new Student("18A03","bharu","eee",92);
		Student stud4 = new Student("18A04","dhana","cse",78);
		
		System.out.println(stud1.isEqual(stud3));
		System.out.println(stud2.isEqual(stud2));
	}
}


