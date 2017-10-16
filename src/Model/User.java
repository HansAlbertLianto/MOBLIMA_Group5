package Model;

public class User extends Person{
	
	private String _id;
	private String password;
	
	public User(String name, int age, String id, String password) {
		super(name, age);
		this._id = id;
		this.password = password;
	}

	@Override
	public void doLogin(String username, String password) {
		// Connect it to file manager, and auth, then do the completion
		if(username == this._id && password == this.password) {
			//Successful Login
		} else {
			//Unsuccessful Login
		}
	}
}
