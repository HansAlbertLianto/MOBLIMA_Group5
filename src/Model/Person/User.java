package Model.Person;

import java.util.*;
public class User extends Person{
	private String _id;
	private String password;
	private boolean isStaff; //0 = User, 1 = Staff
	
	public User(String name, int age, String id, String password, boolean isStaff) {
		super(name, age);
		this._id = id;
		this.password = password;
		this.isStaff = isStaff;
	}
	
}
