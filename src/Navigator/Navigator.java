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
                RegisterView registerView = new RegisterView();
                navigatorStack.add(registerView);
                registerView.appear();
                break;
            case OPEN_FORGOT:
                ForgotView forgotView = new ForgotView();
                navigatorStack.add(forgotView);
                forgotView.appear();
                break;
            case OPEN_ADMIN_HOME:
                AdminHomeView adminHomeView = new AdminHomeView();
                navigatorStack.add(adminHomeView);
                adminHomeView.appear();
                break;
            case OPEN_MOVIE:
                MovieView movieView = new MovieView();
                navigatorStack.add(movieView);
                movieView.appear();
                break;
            case OPEN_CINEMA:
                CinemaView cinemaView = new CinemaView();
                navigatorStack.add(cinemaView);
                cinemaView.appear();
                break;
            case OPEN_CINEMA_MOVIE:
                CinemaMovieView cinemaMovieView = new CinemaMovieView();
                navigatorStack.add(cinemaMovieView);
                cinemaMovieView.appear();
                break;
            case OPEN_SETTING:
                SettingsView settingsView = new SettingsView();
                navigatorStack.add(settingsView);
                settingsView.appear();
                break;
            case OPEN_TOP_5_EDITOR:
                Top5EditView top5EditView = new Top5EditView();
                navigatorStack.add(top5EditView);
                top5EditView.appear();
                break;
            case OPEN_USER_HOME:
                UserHomeView userHomeView = new UserHomeView();
                navigatorStack.add(userHomeView);
                userHomeView.appear();
                break;
            case OPEN_SEARCH_FILTER_VIEW:
                SearchFilterView searchFilterView = new SearchFilterView();
                navigatorStack.add(searchFilterView);
                searchFilterView.appear();
                break;
            case OPEN_MOVIE_DETAILS:
                MovieDetailsView movieDetailsView = new MovieDetailsView();
                navigatorStack.add(movieDetailsView);
                movieDetailsView.appear();
                break;
            case OPEN_BOOKING:
                BookingView bookingView = new BookingView();
                navigatorStack.add(bookingView);
                bookingView.appear();
                break;
            case OPEN_BOOKING_HISTORY:
                BookingHistoryView bookingHistoryView = new BookingHistoryView();
                navigatorStack.add(bookingHistoryView);
                bookingHistoryView.appear();
                break;
            case OPEN_TOP_5:
                Top5View top5View = new Top5View();
                navigatorStack.add(top5View);
                top5View.appear();
                break;
            case EXIT:
                navigatorStack.pop();
                if (navigatorStack.isEmpty()) System.exit(0);
                navigatorStack.peek().appear();
                break;
        }
    }

    @Override
    public void printError() {
        navigatorStack.peek().printError();
    }

    @Override
    public void printSuccess() {
        navigatorStack.peek().printSuccess();
    }

    @Override
    public void printDetails(String msg) {
        navigatorStack.peek().printDetails(msg);
    }

    private void popUntil(View view){
        while(!navigatorStack.isEmpty()
                && navigatorStack.peek().getClass() == view.getClass()){
            navigatorStack.pop();
        }
    }
}
