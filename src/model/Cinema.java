package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Cinema implements Serializable {
    private String name;
    private Seat seat = new Seat();
    private ArrayList<CinemaMovie> cinemaMovies = new ArrayList<CinemaMovie>();

    public Cinema(String cinema_name) {
        this.name = cinema_name;
    }

    public String getName() {
        return this.name;
    }

    public Seat getSeat() {
        return this.seat;
    }

    public ArrayList<CinemaMovie> getCinemaMovies() {
        return cinemaMovies;
    }

    public void addCinemaMovies(CinemaMovie cinemaMovie){
        cinemaMovies.add(cinemaMovie);
    }

    public void deleteCinemaMovie(CinemaMovie cinemaMovie){
        cinemaMovies.remove(cinemaMovie);
    }
}
