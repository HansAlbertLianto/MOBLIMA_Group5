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
            case OPEN_CINEMA:
                CinemaView cinemaView = new CinemaView();
                navigatorStack.add(cinemaView);
                cinemaView.appear();
                break;
            case OPEN_CINEMA_MOVIE:
                CinemaMovieView cinemaMovieView = new CinemaMovieView();
                navigatorStack.add(cinemaMovieView);
                cinemaMovieView.appear();
            case OPEN_MOVIE_TOP_5:
                MovieTop5View movieTop5View = new MovieTop5View();
                navigatorStack.add(movieTop5View);
                movieTop5View.appear();
                break;
            case OPEN_SEARCH_LIST_MOVIE:
                SearchListMovieView searchListMovieView = new SearchListMovieView();
                navigatorStack.add(searchListMovieView);
                searchListMovieView.appear();
                break;
            case EXIT:
                pop(getCurrentView());
                if (navigatorStack.isEmpty()) System.exit(0);
                navigatorStack.peek().appear();
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
            case OPEN_ADMIN_ADD_MOVIE:
                AdminAddMovie adminAddMovie = new AdminAddMovie();
                navigatorStack.add(adminAddMovie);
                adminAddMovie.appear();
                break;
            case OPEN_ADMIN_EDIT_REMOVE_VIEW:
                AdminEditMovie adminEditMovie = new AdminEditMovie();
                navigatorStack.add(adminEditMovie);
                adminEditMovie.appear();
                break;
            case OPEN_ADMIN_CINEMA_MOVIE_VIEW:
                AdminCinemaMovieView adminCinemaMovieView = new AdminCinemaMovieView();
                navigatorStack.add(adminCinemaMovieView);
                adminCinemaMovieView.appear();
                break;
            case OPEN_ADMIN_MOVIE_DETAILS:
                AdminMovieDetailsView adminMovieDetailsView = new AdminMovieDetailsView();
                navigatorStack.add(adminMovieDetailsView);
                adminMovieDetailsView.appear();
                break;
            case OPEN_ADMIN_SETTING:
                AdminSettingView adminSettingView = new AdminSettingView();
                navigatorStack.add(adminSettingView);
                adminSettingView.appear();
                break;
            //----------------------------------------
            //Movie goer Navigation Service
            //----------------------------------------
            case OPEN_USER_LOGIN:
                UserLoginView userLoginView = new UserLoginView();
                navigatorStack.add(userLoginView);
                userLoginView.appear();
                break;
            case OPEN_USER_HOME:
                UserHomeView userHomeView = new UserHomeView();
                navigatorStack.add(userHomeView);
                userHomeView.appear();
                break;
            case OPEN_USER_BOOKING_HISTORY:
                UserBookingHistoryView userBookingHistoryView = new UserBookingHistoryView();
                navigatorStack.add(userBookingHistoryView);
                userBookingHistoryView.appear();
                break;
            case OPEN_USER_CINEMA_MOVIE_VIEW:
                UserCinemaMovieView userCinemaMovieView = new UserCinemaMovieView();
                navigatorStack.add(userCinemaMovieView);
                userCinemaMovieView.appear();
                break;
            case OPEN_USER_BOOKING:
                UserBookingView userBookingView = new UserBookingView();
                navigatorStack.add(userBookingView);
                userBookingView.appear();
                break;
            case OPEN_USER_MOVIE_DETAILS:
                UserMovieDetailsView userMovieDetailsView  = new UserMovieDetailsView();
                navigatorStack.add(userMovieDetailsView);
                userMovieDetailsView.appear();
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
        }
        else if (view.getClass().equals(UserHomeView.class)){
            popUntil(LandingView.class);
        }
        else if (view.getClass().equals(LandingView.class)){
            System.exit(0);
        }
        else {
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
