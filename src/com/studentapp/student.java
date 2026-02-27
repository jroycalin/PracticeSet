package com.studentapp;

import java.util.ArrayList;
import java.util.List;

public class student {		//the variables not having static known as instance variable otherwise it would be class variables
	private String name;	//instance variables will be marked always with private
	private int age;		//instance variables will be marked always with private
	private String studentID;	//instance variables will be marked always with private
	private List<String> courses;	//instance variables will be marked always with private
	
	public student(String name, int age, String studentID) {
		super();
		this.name = name;
		this.age = age;
		this.studentID = studentID;
		courses = new ArrayList<String>();
	}
	public void enrollCourse(String course) {
		courses.add(course);
		System.out.println("Student is enrolled to "+course+"successfully!!");
	}
	public void printStudentInfo() {
		System.out.println("===========  Student Information  ===========");
		System.out.println("Student Name: "+name);
		System.out.println("Student Age: "+age);
		System.out.println("Student studentID: "+studentID);
		System.out.println("Enrolled for the Courses: "+courses);
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + ", studentID=" + studentID + ", courses=" + courses + "]";
	}
	
	
}
