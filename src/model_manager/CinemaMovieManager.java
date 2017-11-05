package model_manager;

import file_manager.FileManager;
import file_manager.LoadType;
import file_manager.SaveType;
import model.Cinema;
import model.CinemaMovie;
import model.Seat;
import model.SeatLayout;

import java.util.ArrayList;

public class CinemaMovieManager {

    private FileManager fileManager = FileManager.getInstance();

    public ArrayList<CinemaMovie> getAllCinemaMovie(Cinema cinema){
//        Object result = fileManager.getData(LoadType.LOAD_ALL_CINEMA_MOVIE_BY_CINEMA, cinema.getId());
//        if(result == null) return null;
//        ArrayList<CinemaMovie> cinemaMovies = (ArrayList<CinemaMovie>) result;
//        return cinemaMovies;
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