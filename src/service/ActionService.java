package service;

import model.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface ActionService {

    public void doLogin(String username, String password);

    // ----------------------------------
    // Movie Action
    // ----------------------------------

    public ArrayList<Movie> doSearchMovie(String search);

    public ArrayList<Movie> doGetAllMovies();

    public void setCurrentMovie(Movie currentMovie);

    public Movie doGetCurrentMovie();

    public MovieDetails doGetAllDetails();

    public void doAddMovie(Movie movie);

    public void doEditMovie(Movie editedMovie);

    public void doRemoveMovie(Movie movie);

    //  ----------------------------------
    //  Review & Ratings
    //  ----------------------------------

    public void doAddReview(Movie movie, Person person, Review review);

    public void doAddRating(Movie movie, Person person, int rating);

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

    public Cinema doGetCurrentCinemaMovie();

    public void doGetSeatLayout(CinemaMovie cinemaMovie);

    public void doBook(CinemaMovie cinemaMovie, Seat seat);

    public void doPurchase(CinemaMovie cinemaMovie);

    public void doAddMovieToCinema(CinemaMovie cinemaMovie, Movie movie);

    public void doChangeCinemaMovieTimes(CinemaMovie cinemaMovie, CinemaMovie.CinemaMovieDate cinemaMovieDate);

    //  ----------------------------------
    //  Movie-goers Action
    //  ----------------------------------

    public void doGetAllBookingHistory();

    //  ----------------------------------
    //  Admin Action
    //  ----------------------------------

    //  General settings
    public void doChangeTicketPrices();

    public void doChangePublicHoliday();
}
