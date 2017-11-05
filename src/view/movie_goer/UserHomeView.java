package view.movie_goer;

import service.Service;
import view.View;

public class UserHomeView extends View {

    private static final String message =
            "Welcome to MOBLIMA, user! What would you like to do? \n" +
                    "1. Search for Movies \n" +
                    "2. Logout";

    public UserHomeView() {
        super(message, 1, 2);
    }

    @Override
    protected void manageResponse() {
        switch (this.response) {
            case 1:
                service.goSearchListMovie();
                break;
            case 2:
                service.goExit();
                break;
            default:
                break;
        }
    }

}
