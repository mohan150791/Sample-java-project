package org.sample;

public class Encapchild extends Encap {
	
	public static void main(String[] args) {
		Encapchild e=new Encapchild();
		e.setName("Mohan");
		e.setAge(30);
		String name = e.getName();
		int age = e.getAge();
		System.out.println(name);
		System.out.println(age);

	}

}
