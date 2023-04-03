package OverRiding;
//parent class
public class Person {
	private String name;
	private int age;
	
	public Person() {
		System.out.println("this person default constr");
	}
	public Person(String name) {
		this.name = name;
		System.out.println("In person 2nd constr.name is set "+ this.name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println(name);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
