package View;

import Model.UserType;
public class RegisterView extends View{
	private String username;
	private String password;
	private UserType usertype;
	private static final String usertype_msg =
			"User Type = \n"+
			"1. Staff\n"+
			"2. User\n";
	
    public RegisterView() {
        super(usertype_msg, 1, 2);
    }

    @Override
    public void appear() {
        super.appear();
        username = Message.inputString(4, 16, "username");
        password = Message.inputString(4, 16, "password");
        this.manageResponse();
    }

    @Override
    protected void manageResponse() {
        service.doRegister(response, username, password);
    }
}