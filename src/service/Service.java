package service;

import navigator.*;

public class Service implements ActionService, NavigationService {
    private static Service singleton = null;

    private static Navigator navigator = Navigator.getInstance();

    private Service() {
    }

    public static Service getInstance() {
        if (singleton == null) singleton = new Service();
        return singleton;
    }

    @Override
    public void doLogin(String username, String password) {
        if (username.equals("admin") && password.equals("admin")) {
            navigator.handleSuccess();
        } else {
            navigator.handleError();
        }
    }

    @Override
    public void doSearchMovie() {

    }

    @Override
    public void doPrintListMovie() {

    }

    @Override
    public void doPrintMovieDetails() {

    }

    @Override
    public void doCheckSeat() {

    }

    @Override
    public void doBook() {

    }

    @Override
    public void doPurchase() {

    }

    @Override
    public void doFindHistory() {

    }

    @Override
    public void doChangeMovieDetails() {

    }

    @Override
    public void doAddMovieToCinema() {

    }

    @Override
    public void doChangeTicketPrices() {

    }

    @Override
    public void doChangePublicHoliday() {

    }

    @Override
    public void goLogin() {
        navigator.doAction(ActionTypes.OPEN_LOGIN);
    }

    @Override
    public void goAdminHome() {
        navigator.doAction(ActionTypes.OPEN_ADMIN_HOME);
    }

    @Override
    public void goMovie() {
        navigator.doAction(ActionTypes.OPEN_MOVIE);
    }

    @Override
    public void goCineplex() {
        navigator.doAction(ActionTypes.OPEN_CINEPLEX);
    }

    @Override
    public void goCinema() {
        navigator.doAction(ActionTypes.OPEN_CINEMA);
    }

    @Override
    public void goCinemaMovie() {
        navigator.doAction(ActionTypes.OPEN_CINEMA_MOVIE);
    }

    @Override
    public void goSettings() {
        navigator.doAction(ActionTypes.OPEN_SETTING);
    }

    @Override
    public void goTop5Edit() {
        navigator.doAction(ActionTypes.OPEN_TOP_5_EDITOR);
    }

    @Override
    public void goUserHome() {
        navigator.doAction(ActionTypes.OPEN_USER_HOME);
    }

    @Override
    public void goSearchFilterView() {
        navigator.doAction(ActionTypes.OPEN_SEARCH_FILTER_VIEW);
    }

    @Override
    public void goMovieDetails() {
        navigator.doAction(ActionTypes.OPEN_MOVIE_DETAILS);
    }

    @Override
    public void goBooking() {
        navigator.doAction(ActionTypes.OPEN_BOOKING);
    }

    @Override
    public void goBookingHistory() {
        navigator.doAction(ActionTypes.OPEN_BOOKING_HISTORY);
    }

    @Override
    public void goTop5View() {
        navigator.doAction(ActionTypes.OPEN_TOP_5);
    }

    @Override
    public void goExit() {
        navigator.doAction(ActionTypes.EXIT);
    }

	public void goUserMoviesView() {
		navigator.doAction(ActionTypes.OPEN_USER_MOVIES_VIEW);
	}
}
