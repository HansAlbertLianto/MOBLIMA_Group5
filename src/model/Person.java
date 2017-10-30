package model;

public abstract class Person {

	private String fullName;
	private int age;
	
	public Person(String fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}

	public void setFullName(String fullName) { this.fullName = fullName; }
	public String getFullName() { return this.fullName; }
	
	public void setAge(int age) { this.age = age; }
	public int getAge() { return this.age; }
	
}
