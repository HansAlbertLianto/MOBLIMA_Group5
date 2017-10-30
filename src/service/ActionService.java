package service;

import model.Cinema;
import model.CinemaMovie;
import model.Cineplex;

import java.util.ArrayList;

public interface ActionService {

    public void doLogin(String username, String password);

    // ----------------------------------
    // Movie Action
    // ----------------------------------

    public void doSearchMovie();

    public void doPrintListMovie();

    public void doPrintMovieDetails();

    //  ----------------------------------
    //  Cineplex Action
    //  ----------------------------------
    public ArrayList<Cineplex> doGetAllCineplex();

    // ----------------------------------
    // Cinema Action
    // ----------------------------------
    public ArrayList<Cinema> doGetAllCinema(Cineplex cineplex);

    //  ----------------------------------
    //  Cinema Movie Action
    //  ----------------------------------
    public ArrayList<CinemaMovie> doGetAllCinemaMovie(Cinema cinema);

    public void doCheckSeat(CinemaMovie cinemaMovie);

    public void doBook(CinemaMovie cinemaMovie);

    public void doPurchase(CinemaMovie cinemaMovie);

    //  ----------------------------------
    //  Movie-goers Action
    //  ----------------------------------
    public void doFindHistory();

    //  ----------------------------------
    //  Admin Action
    //  ----------------------------------
    public void doChangeMovieDetails();

    public void doAddMovieToCinema();

    public void doChangeTicketPrices();

    public void doChangePublicHoliday();
}
