package Service;

import Navigator.*;

public class Service implements ActionService, NavigationService {
    private static Service singleton = null;

    private Service() {
    }

    public static Service getInstance() {
        if (singleton == null) singleton = new Service();
        return singleton;
    }

    @Override
    public void doLogin(String username, String password) {
        if (username == "admin" && password == "admin") {
            goAdminHome();
        }
        if (username == "user" && password == "user") {
            goUserHome();
        }
    }

    @Override
    public void doRegister() {

    }

    @Override
    public void doForgot() {

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
        Navigator.getInstance().doAction(ActionTypes.OPEN_LOGIN);
    }

    @Override
    public void goRegister() {
        Navigator.getInstance().doAction(ActionTypes.OPEN_REGISTER);
    }

    @Override
    public void goForgot() {
        Navigator.getInstance().doAction(ActionTypes.OPEN_FORGOT);
    }

    @Override
    public void goAdminHome() {
        Navigator.getInstance().doAction(ActionTypes.OPEN_ADMIN_HOME);
    }

    @Override
    public void goMovie() {
        Navigator.getInstance().doAction(ActionTypes.OPEN_MOVIE);
    }

    @Override
    public void goCinema() {
        Navigator.getInstance().doAction(ActionTypes.OPEN_CINEMA);
    }

    @Override
    public void goCinemaMovie() {
        Navigator.getInstance().doAction(ActionTypes.OPEN_CINEMA_MOVIE);
    }

    @Override
    public void goSettings() {
        Navigator.getInstance().doAction(ActionTypes.OPEN_SETTING);
    }

    @Override
    public void goTop5Edit() {
        Navigator.getInstance().doAction(ActionTypes.OPEN_TOP_5_EDITOR);
    }

    @Override
    public void goUserHome() {
        Navigator.getInstance().doAction(ActionTypes.OPEN_USER_HOME);
    }

    @Override
    public void goSearchFilterView() {
        Navigator.getInstance().doAction(ActionTypes.OPEN_SEARCH_FILTER_VIEW);
    }

    @Override
    public void goMovieDetails() {
        Navigator.getInstance().doAction(ActionTypes.OPEN_MOVIE_DETAILS);
    }

    @Override
    public void goBooking() {
        Navigator.getInstance().doAction(ActionTypes.OPEN_BOOKING);
    }

    @Override
    public void goBookingHistory() {
        Navigator.getInstance().doAction(ActionTypes.OPEN_BOOKING_HISTORY);
    }

    @Override
    public void goTop5View() {
        Navigator.getInstance().doAction(ActionTypes.OPEN_TOP_5);
    }

    @Override
    public void goExit() {
        Navigator.getInstance().doAction(ActionTypes.EXIT);
    }
}
