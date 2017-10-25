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
            goAdminHome();
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
        Navigator.getInstance().doAction(ActionTypes.OPEN_LANDING);
    }

    @Override
    public void goRegister() {

    }

    @Override
    public void goForgot() {

    }

    @Override
    public void goAdminHome() {

    }

    @Override
    public void goMovie() {

    }

    @Override
    public void goCinema() {

    }

    @Override
    public void goCinemaMovie() {

    }

    @Override
    public void goSettings() {

    }

    @Override
    public void goTop5Edit() {

    }

    @Override
    public void goUserHome() {

    }

    @Override
    public void goSearchFilterView() {

    }

    @Override
    public void goMovieDetails() {

    }

    @Override
    public void goBooking() {

    }

    @Override
    public void goBookingHistory() {

    }

    @Override
    public void goTop5View() {

    }

    @Override
    public void goExit() {
        Navigator.getInstance().doAction(ActionTypes.EXIT);
    }
}
