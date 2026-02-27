package com.studentapp;

public class main {

	public static void main(String[] args) {
		System.out.println("*************Student Management System*************");
		student s1;
		s1 = new student("Kajol", 22, "student_1");
		//System.out.println(s1);		//tostring method allows the output
		s1.printStudentInfo();
	}

}
