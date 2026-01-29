package com.enc;

public class StudentDetail {

	public static void main(String[] args) {
		
		Student st = new Student();
		System.err.println("Student Details..");
		st.setId(44);
		st.setName("Rahul");
		System.out.println("Student ID = "+ st.getId());
		System.out.println("Student Name = "+ st.getName());
	}
}
