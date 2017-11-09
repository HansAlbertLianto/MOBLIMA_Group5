package service;

import model.*;

import java.util.ArrayList;

public interface ActionService {

    public void doLogin(String username, String password);

    public void doLogout();

    public void doUserLogin(String phoneNumber);

    // ----------------------------------
    // Movie Action
    // ----------------------------------

    public ArrayList<Movie> doSearchMovie(String search);

    public ArrayList<Movie> doGetAllMovies();

    public void setCurrentMovie(Movie currentMovie);

    public Movie doGetCurrentMovie();

    public MovieDetails doGetAllDetails();

    public void doAddMovie(String title, int status, String synopsis,
                           String genre, String director, String cast);

    public void doEditMovie(Movie editedMovie);

    public void doRemoveMovie(Movie movie);

    //  ----------------------------------
    //  Review & Ratings
    //  ----------------------------------

    public void doAddReview(Movie movie, User user, Review review);

    public void doAddRating(Movie movie, User user, int rating);

    //  ----------------------------------
    //  Cineplex Action
    //  ----------------------------------

    public ArrayList<Cineplex> doGetAllCineplex();

    public void setCurrentCineplex(Cineplex currentCineplex);

    public Cineplex doGetCurrentCineplex();

    // ----------------------------------
    // Cinema Action
    // ----------------------------------
    public ArrayList<Cinema> doGetAllCinema();

    public void setCurrentCinema(Cinema currentCinema);

    public Cinema doGetCurrentCinema();

    //  ----------------------------------
    //  Cinema Movie Action
    //  ----------------------------------
    public ArrayList<CinemaMovie> doGetAllCinemaMovie(Cinema cinema);

    public void setCurrentCinemaMovie(CinemaMovie currentCinemaMovie);

    public CinemaMovie doGetCurrentCinemaMovie();

    public void doGetSeatLayout(CinemaMovie cinemaMovie);

    public void doBook(CinemaMovie cinemaMovie, Seat seat);

    public void doPurchase(CinemaMovie cinemaMovie);

    public void tryAddingMovieToCinema();

    public boolean isTryAddingMovie();

    public void doAddMovieToCinema();

    public void doEditCinemaMovie();

    //  ----------------------------------
    //  Movie-goers Action
    //  ----------------------------------

    public boolean doGetCurrentUser();

    public void doGetAllBookingHistory();

    //  ----------------------------------
    //  Admin Action
    //  ----------------------------------

    //  General settings
    public void doChangeTicketPrices();

    public void doChangePublicHoliday();
}
