package com.person_details;

public class Person {
	static String name;
	static int age;
	static char gender;
	
	public Person(String name,int age,char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		
	}
}
	class Util
	{
		public static Person get_Deatails()
		{
			String name="Thrinadh";
			int age=26;
			char gender='M';
			return new Person(name,age,gender);
		}
	
	public static void main(String[] args) {
		Person person= get_Deatails();
		
		System.out.println("The Name is "+person.name);
		System.out.println("The Age is "+person.age);

		System.out.println("The Gender is "+person.gender);


	 }
}

