package View;

public class LoginView extends View {
    private String username;
    private String password;

    private static final String msg = "Please login using your admin credentials\n";

    public LoginView() {
        super(msg);
    }

    @Override
    public void appear() {
        username = Message.inputString(4, 16, "username");
        password = Message.inputString(4, 16, "password");
        this.manageResponse();
    }

    @Override
    protected void manageResponse() {
        service.doLogin(username, password);
    }
}
