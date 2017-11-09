package service;

public interface NavigationService {

    //----------------------------------------
    //Common Navigation Service
    //----------------------------------------

    public void goLanding();

    public void goCineplex();

    public void goCinema();

    public void goMovieTop5();

    public void goSearchListMovie();

    public void goCinemaMovieList();

    public void goExit();

    //----------------------------------------
    //Admin Navigation Service
    //----------------------------------------

    public void goAdminLogin();

    public void goAdminHome();

    public void goAdminAddMovie();

    public void goAdminEditRemoveMovie();

    public void goAdminCinemaMovie();

    public void goAdminMovieDetails();

    public void goAdminSetting();


    //----------------------------------------
    //Movie goer Navigation Service
    //----------------------------------------
    public void goUserLogin();

    public void goUserHome();

    public void goUserBookingHistory();

    public void goUserCinemaMovie();

    public void goUserBooking();

    public void goUserMovieDetails();

}
