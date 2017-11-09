package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Cinema implements Serializable {
    private int id;
    private Cineplex cineplex;
    private String name;
    private ArrayList<CinemaMovie> cinemaMovies = new ArrayList<CinemaMovie>();

    public Cinema(String cinema_name) {
        this.name = cinema_name;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<CinemaMovie> getCinemaMovies() {
        return cinemaMovies;
    }

    public void addCinemaMovies(CinemaMovie cinemaMovie){
        cinemaMovies.add(cinemaMovie);
    }

    public void deleteCinemaMovie(CinemaMovie cinemaMovie){
        for(CinemaMovie cinemaMovietemp : cinemaMovies){
            if(cinemaMovie.getMovie().getId() == cinemaMovie.getMovie().getId() &&
                    cinemaMovie.getDate().toString().equals(cinemaMovie.getDate().toString()))
                cinemaMovies.remove(cinemaMovietemp);
        }
    }

    public Cineplex getCineplex() {
        return cineplex;
    }

    public void setCineplex(Cineplex cineplex) {
        this.cineplex = cineplex;
    }

    @Override
    public String toString() {
        return cineplex.toString() + " Cinema " + getName();
    }

    public String getId() {
        return Integer.toString(id);
    }

    public void setId(int id) {
        this.id = id;
    }
}
