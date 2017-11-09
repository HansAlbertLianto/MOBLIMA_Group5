package view.movie_goer;

import model_manager.UserManager;
import view.View;

public class UserLoginView extends View {
    private static final String message = "Please login using your phone number";
    private static final String LOGIN_SUCCESS = "Login is successful !\n";
    private static final String LOGIN_FAILED = "Your phone nmber is not valid\n";
    private String phoneNumber;
    private UserManager userManager = UserManager.getInstance();

    public UserLoginView(){
        super(message);
    }

    @Override
    public void appear(){
        super.appear();
        phoneNumber = Integer.toString(Message.inputInt(1, 999999999, "phone number"));
        this.manageResponse();
    }

    @Override
    public void handleSuccess(){
        super.handleSuccess();
        Message.printMessage(LOGIN_SUCCESS);
        service.goUserHome();
    }

    @Override
    public void handleError(){
        super.handleError();
        Message.printMessage(LOGIN_FAILED);
        String option = Message.inputStringWithOption(Message.yesOrNoOption(), "Do you want to create new user (Y/n)?");
        if (Message.resultOfYesOrNoOption(option)){
            String fullname = Message.inputString(1, 20, "fullname");
            int age = Message.inputInt(1, 999, "age");
            String phoneNumber = this.phoneNumber;
            userManager.addUser(fullname, age, phoneNumber);
            this.appear();
        }
        else
            service.goExit();
    }

    protected void manageResponse(){
        service.doUserLogin(phoneNumber);
    }
}
