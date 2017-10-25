package Navigator;

import View.*;

import java.lang.*;
import java.util.Stack;

public class Navigator implements NavigatorInterface {

    private static Navigator singleton = null;

    private static Stack<View> navigatorStack = new Stack<View>();

    private Navigator() {
    }

    public static Navigator getInstance() {
        if (singleton == null) singleton = new Navigator();
        return singleton;
    }

    @Override
    public void doAction(ActionTypes action) {
        switch (action) {
            case OPEN_LANDING:
                LandingView landingView = new LandingView();
                navigatorStack.add(landingView);
                landingView.appear();
                break;
            case OPEN_LOGIN:
                LoginView loginView = new LoginView();
                navigatorStack.add(loginView);
                loginView.appear();
                break;
            case OPEN_REGISTER:
                break;
            case OPEN_FORGOT:
                break;
            case OPEN_ADMIN_HOME:
                break;
            case OPEN_MOVIE:
                break;
            case OPEN_CINEMA:
                break;
            case OPEN_CINEMA_MOVIE:
                break;
            case OPEN_SETTING:
                break;
            case OPEN_TOP_5_EDITOR:
                break;
            case OPEN_USER_HOME:
                break;
            case OPEN_SEARCH_FILTER_VIEW:
                break;
            case OPEN_MOVIE_DETAILS:
                break;
            case OPEN_BOOKING:
                break;
            case OPEN_BOOKING_HISTORY:
                break;
            case OPEN_TOP_5:
                break;
            case EXIT:
                navigatorStack.pop();
                if (navigatorStack.isEmpty()) System.exit(0);
                navigatorStack.peek().appear();
                break;
        }
    }

    @Override
    public void closeCurrentView() {

    }

    @Override
    public void printError() {

    }

    @Override
    public void printSuccess() {

    }

    @Override
    public void printDetails(String msg) {

    }
}
