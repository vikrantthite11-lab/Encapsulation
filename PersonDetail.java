package com.enc;

public class PersonDetail {

	public static void main(String[] args) {
		
		Person p = new Person();
		System.err.println("Person Detail...");
		p.setName("Rohan");
		p.setAge(34);
		System.out.println("Person Name = "+ p.getName());
		System.out.println("Person Age = "+ p.getAge());
	}
}
