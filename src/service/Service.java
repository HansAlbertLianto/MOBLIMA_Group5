package service;

import model.*;
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
    private boolean isAdmin = false;
    private boolean isAddingCinemaMovie = false;
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
    public void doLogout() {
        isAdmin = false;
    }

    @Override
    public void doLogin(String username, String password) {
        if (username.equals("admin") && password.equals("admin")) {
            isAdmin = true;
            navigator.handleSuccess();
        } else {
            navigator.handleError();
        }
    }

    @Override
    public boolean doGetCurrentUser() {
        return !isAdmin;
    }

    @Override
    public ArrayList<Movie> doSearchMovie(String search) {
        ArrayList<Movie> allMovies = movieManager.getAllMovie();
        ArrayList<Movie> result = new ArrayList<Movie>();
        for (Movie movie : allMovies) {
            if (movie.getMovieTitle().contains(search)) {
                result.add(movie);
            }
        }
        return result;
    }

    @Override
    public ArrayList<Movie> doGetAllMovies() {
        return movieManager.getAllMovie();
    }

    @Override
    public void setCurrentMovie(Movie currentMovie) {
        this.currentMovie = currentMovie;
    }

    @Override
    public Movie doGetCurrentMovie() {
        return currentMovie;
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
        currentMovie = editedMovie;
        movieManager.changeDetailsMovie(editedMovie);
    }

    @Override
    public void doRemoveMovie(Movie movie) {
        movieManager.removeMovie(movie);
    }

    @Override
    public void doAddReview(Movie movie, Person person, Review review) {

    }

    @Override
    public void tryAddingMovieToCinema() {
        isAddingCinemaMovie = true;
    }

    @Override
    public boolean isTryAddingMovie() {
        return isAddingCinemaMovie;
    }

    @Override
    public void doAddRating(Movie movie, Person person, int rating) {

    }

    @Override
    public ArrayList<Cineplex> doGetAllCineplex() {
        return cineplexManager.getAllCineplex();
    }

    @Override
    public void setCurrentCineplex(Cineplex currentCineplex) {
        this.currentCineplex = currentCineplex;
    }

    @Override
    public Cineplex doGetCurrentCineplex() {
        return currentCineplex;
    }

    @Override
    public ArrayList<Cinema> doGetAllCinema() {
        return currentCineplex.getCinemas();
    }

    @Override
    public void setCurrentCinema(Cinema currentCinema) {
        this.currentCinema = currentCinema;
    }

    @Override
    public Cinema doGetCurrentCinema() {
        return currentCinema;
    }

    @Override
    public ArrayList<CinemaMovie> doGetAllCinemaMovie(Cinema cinema) {
        return currentCinema.getCinemaMovies();
    }

    @Override
    public void setCurrentCinemaMovie(CinemaMovie currentCinemaMovie) {
        this.currentCinemaMovie = currentCinemaMovie;
    }

    @Override
    public CinemaMovie doGetCurrentCinemaMovie() {
        return currentCinemaMovie;
    }

    @Override
    public void doGetSeatLayout(CinemaMovie cinemaMovie) {
        return;
    }

    @Override
    public void doBook(CinemaMovie cinemaMovie, Seat seat) {

    }

    @Override
    public void doPurchase(CinemaMovie cinemaMovie) {

    }

    @Override
    public void doAddMovieToCinema() {
        this.isAddingCinemaMovie = false;
        cineplexManager.addCinemaMovie(currentCineplex);
    }

    @Override
    public void doEditCinemaMovie() {
        cineplexManager.addCinemaMovie(currentCineplex);
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
        navigator.doAction(ActionTypes.OPEN_LANDING);
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
    public void goMovieTop5() {
        navigator.doAction(ActionTypes.OPEN_MOVIE_TOP_5);
    }

    @Override
    public void goSearchListMovie() {
        navigator.doAction(ActionTypes.OPEN_SEARCH_LIST_MOVIE);
    }

    @Override
    public void goCinemaMovieList() {
        navigator.doAction(ActionTypes.OPEN_CINEMA_MOVIE);
    }

    @Override
    public void goExit() {
        navigator.doAction(ActionTypes.EXIT);
    }

    @Override
    public void goAdminLogin() {
        navigator.doAction(ActionTypes.OPEN_ADMIN_LOGIN);
    }

    @Override
    public void goAdminHome() {
        navigator.doAction(ActionTypes.OPEN_ADMIN_HOME);
    }

    @Override
    public void goAdminAddMovie() {
        navigator.doAction(ActionTypes.OPEN_ADMIN_ADD_MOVIE);
    }

    @Override
    public void goAdminEditRemoveMovie() {
        navigator.doAction(ActionTypes.OPEN_ADMIN_EDIT_REMOVE_VIEW);
    }

    @Override
    public void goAdminCinemaMovie() {
        navigator.doAction(ActionTypes.OPEN_ADMIN_CINEMA_MOVIE_VIEW);
    }

    @Override
    public void goAdminMovieDetails() {
        navigator.doAction(ActionTypes.OPEN_ADMIN_MOVIE_DETAILS);
    }

    @Override
    public void goAdminSetting() {
        navigator.doAction(ActionTypes.OPEN_ADMIN_SETTING);
    }

    @Override
    public void goUserHome() {
        isAdmin = false;
        navigator.doAction(ActionTypes.OPEN_USER_HOME);
    }

    @Override
    public void goUserBookingHistory() {
        navigator.doAction(ActionTypes.OPEN_USER_BOOKING_HISTORY);
    }

    @Override
    public void goUserCinemaMovie() {
        navigator.doAction(ActionTypes.OPEN_USER_CINEMA_MOVIE_VIEW);
    }

    @Override
    public void goUserBooking() {
        navigator.doAction(ActionTypes.OPEN_USER_BOOKING);
    }

    @Override
    public void goUserMovieDetails() {
        navigator.doAction(ActionTypes.OPEN_USER_MOVIE_DETAILS);
    }

}
