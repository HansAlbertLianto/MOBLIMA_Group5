package service;

import model.*;
import navigator.*;

import java.util.ArrayList;

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
    public void doSearchMovie(String search) {

    }

    @Override
    public void doGetAllMovies() {

    }

    @Override
    public void doGetAllDetails(Movie movie) {

    }

    @Override
    public void doAddMovie(Movie movie) {

    }

    @Override
    public void doEditMovie(Movie movie, Movie editedMovie) {

    }

    @Override
    public void doRemoveMovie(Movie movie) {

    }

    @Override
    public void doGetAllReview(Movie movie) {

    }

    @Override
    public void doGetMovieRatings(Movie movie) {

    }

    @Override
    public void doAddReview(Movie movie, Person person, Review review) {

    }

    @Override
    public void doAddRating(Movie movie, Person person, int rating) {

    }

    @Override
    public ArrayList<Cineplex> doGetAllCineplex() {
        return null;
    }

    @Override
    public ArrayList<Cinema> doGetAllCinema(Cineplex cineplex) {
        return null;
    }

    @Override
    public ArrayList<CinemaMovie> doGetAllCinemaMovie(Cinema cinema) {
        return null;
    }

    @Override
    public void doGetSeatLayout(CinemaMovie cinemaMovie) {

    }

    @Override
    public void doBook(CinemaMovie cinemaMovie, Seat seat) {

    }

    @Override
    public void doPurchase(CinemaMovie cinemaMovie) {

    }

    @Override
    public void doChangeMovieDetails(Movie movie, MovieDetails details) {

    }

    @Override
    public void doAddMovieToCinema(CinemaMovie cinemaMovie, Movie movie) {

    }

    @Override
    public void doChangeCinemaMovieTimes(CinemaMovie cinemaMovie, CinemaMovie.CinemaMovieDate cinemaMovieDate) {

    }

    @Override
    public void doGetAllBookingHistory() {

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
