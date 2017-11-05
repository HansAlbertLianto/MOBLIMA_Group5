package service;

import model.*;
import model_manager.CinemaMovieManager;
import model_manager.CineplexManager;
import model_manager.MovieManager;
import model_manager.UserManager;
import navigator.*;

import java.util.ArrayList;

public class Service implements ActionService, NavigationService {
    private static Service singleton = null;

    // ----------------------------------
    // Manager
    // ----------------------------------
    private static Navigator navigator = Navigator.getInstance();

    private MovieManager movieManager = MovieManager.getInstance();
    private CineplexManager cineplexManager = CineplexManager.getInstance();
    private UserManager userManager = UserManager.getInstance();

    // ----------------------------------
    // State
    // ----------------------------------
    private Person currentUser;
    private Movie currentMovie;
    private Cineplex currentCineplex;
    private Cinema currentCinema;
    private CinemaMovie currentCinemaMovie;

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
    public ArrayList<Movie> doSearchMovie(String search) {
        return null;
    }

    @Override
    public ArrayList<Movie> doGetAllMovies() {
        return null;
    }

    @Override
    public void setCurrentMovie(Movie currentMovie) {

    }

    @Override
    public Movie doGetCurrentMovie() {
        return null;
    }

    @Override
    public MovieDetails doGetAllDetails() {
        return null;
    }

    @Override
    public void doAddMovie(String title, int status, String synopsis,
                           String genre, String director, String cast) {
        MovieDetails movieDetails = new MovieDetails();
        movieDetails.setShowingStatus(status);
        movieDetails.setSynopsis(synopsis);
        movieDetails.setMovieType(genre);
        movieDetails.setDirector(director);
        movieDetails.setCast(cast);
        movieManager.addMovie(title, movieDetails);
        navigator.handleSuccess();
    }

    @Override
    public void doEditMovie(Movie editedMovie) {

    }

    @Override
    public void doRemoveMovie(Movie movie) {

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
    public void setCurrentCineplex(Cineplex currentCineplex) {

    }

    @Override
    public Cineplex doGetCurrentCineplex() {
        return null;
    }

    @Override
    public ArrayList<Cinema> doGetAllCinema() {
        return null;
    }

    @Override
    public void setCurrentCinema(Cinema currentCinema) {

    }

    @Override
    public Cinema doGetCurrentCinema() {
        return null;
    }

    @Override
    public ArrayList<CinemaMovie> doGetAllCinemaMovie(Cinema cinema) {
        return null;
    }

    @Override
    public void setCurrentCinemaMovie(CinemaMovie currentCinemaMovie) {

    }

    @Override
    public Cinema doGetCurrentCinemaMovie() {
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
    public void goLanding() {

    }

    @Override
    public void goCineplex() {

    }

    @Override
    public void goCinema() {

    }

    @Override
    public void goMovieTop5() {

    }

    @Override
    public void goSearchListMovie() {

    }

    @Override
    public void goExit() {

    }

    @Override
    public void goAdminLogin() {

    }

    @Override
    public void goAdminHome() {

    }

    @Override
    public void goAdminAddMovie() {

    }

    @Override
    public void goAdminEditRemoveMovie() {

    }

    @Override
    public void goAdminCinemaMovie() {

    }

    @Override
    public void goAdminMovieDetails() {

    }

    @Override
    public void goAdminSetting() {

    }

    @Override
    public void goUserHome() {

    }

    @Override
    public void goUserBookingHistory() {

    }

    @Override
    public void goUserCinemaMovie() {

    }

    @Override
    public void goUserBooking() {

    }

    @Override
    public void goUserMovieDetails() {

    }
}
