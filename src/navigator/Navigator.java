package navigator;

import view.*;
import view.admin.*;
import view.movie_goer.*;

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
            //----------------------------------------
            //Common Navigation Service
            //----------------------------------------
            case OPEN_LANDING:
                LandingView landingView = new LandingView();
                navigatorStack.add(landingView);
                landingView.appear();
                break;
            case OPEN_CINEPLEX:
                CineplexView adminCineplexView = new CineplexView();
                navigatorStack.add(adminCineplexView);
                adminCineplexView.appear();
                break;
            //----------------------------------------
            //Admin Navigation Service
            //----------------------------------------
            case OPEN_ADMIN_LOGIN:
                AdminLoginView adminLoginView = new AdminLoginView();
                navigatorStack.add(adminLoginView);
                adminLoginView.appear();
                break;
            case OPEN_ADMIN_HOME:
                AdminHomeView adminHomeView = new AdminHomeView();
                navigatorStack.add(adminHomeView);
                adminHomeView.appear();
                break;
            //----------------------------------------
            //Movie goer Navigation Service
            //----------------------------------------
            case EXIT:
                pop(getCurrentView());
                if (navigatorStack.isEmpty()) System.exit(0);
                navigatorStack.peek().appear();
                break;
        }
    }

    @Override
    public void handleError() {
        navigatorStack.peek().handleError();
    }

    @Override
    public void handleSuccess() {
        navigatorStack.peek().handleSuccess();
    }

    @Override
    public void printDetails(String msg) {
        navigatorStack.peek().printDetails(msg);
    }

    private View getCurrentView() {
        return navigatorStack.peek();
    }

    private void pop(View view) {
        if (view.getClass().equals(AdminHomeView.class)) {
            popUntil(LandingView.class);
        } else {
            navigatorStack.pop();
        }

    }

    private void popUntil(Class viewClass) {
//        System.out.println(viewClass);
        while (!navigatorStack.isEmpty()
                && !getCurrentView().getClass().equals(viewClass)) {
//            System.out.println(getCurrentView().getClass());
            navigatorStack.pop();
        }
    }

}
