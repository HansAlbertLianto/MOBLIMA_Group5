package view.admin;

import view.View;

public class AdminLoginView extends View {
    private static final String message = "Please login using your admin credentials";
    private static final String LOGIN_SUCCESS = "Login is successful !\n";
    private static final String LOGIN_FAILED = "Your username and password do not valid\n";
    private String username;
    private String password;

    public AdminLoginView() {
        super(message);
    }

    @Override
    public void appear() {
        super.appear();
        username = Message.inputString(4, 16, "username");
        password = Message.inputString(4, 16, "password");
        this.manageResponse();
    }

    @Override
    public void handleError() {
        super.handleError();
        Message.printMessage(LOGIN_FAILED);
        String result = Message.inputStringWithOption(Message.yesOrNoOption(), "Do you want to go back or try login (Y/n)");
        switch (result) {
            case "y":
                ;
            case "Y":
                appear();
                break;
            case "n":
                ;
            case "N":
                service.goExit();
            default:
                service.goExit();
        }
    }

    @Override
    public void handleSuccess() {
        super.handleSuccess();
        Message.printMessage(LOGIN_SUCCESS);
        service.goAdminHome();
    }

    @Override
    protected void manageResponse() {
        service.doLogin(username, password);
    }
}
