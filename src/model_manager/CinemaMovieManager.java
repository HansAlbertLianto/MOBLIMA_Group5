package model_manager;

import file_manager.FileManager;
import model.Cinema;
import model.CinemaMovie;
import model.Seat;
import model.SeatLayout;
import model.index.Index;

import java.util.ArrayList;

public class CinemaMovieManager {

    private static CinemaMovieManager singleton = null;

    private Index index = Index.getInstance();
    private FileManager fileManager = FileManager.getInstance();

    public CinemaMovieManager() { }

    public static CinemaMovieManager getInstance() {
        if(singleton == null)
            singleton = new CinemaMovieManager();
        return singleton;
    }

    public ArrayList<CinemaMovie> getAllCinemaMovie(Cinema cinema){
        return null;
    }

    public SeatLayout getSeatLayout(CinemaMovie cinemaMovie){
        return null;
    }

    public void bookCinemaMovie(CinemaMovie cinemaMovie, Seat seat){

    }

    public void purchase(CinemaMovie cinemaMovie, Seat seat){

    }

    public void changeShowtimes(CinemaMovie cinemaMovie, CinemaMovie edited){

    }
}