package Model.Person;

public class NonUser extends Person{
	private boolean isDirector; // 0 = Cast, 1 = Director
	
	public NonUser(String name, int age, boolean isDirector){
		super(name, age);
		this.isDirector = isDirector;
	}
}
