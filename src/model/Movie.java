package model;

import java.io.Serializable;

public class Movie implements Serializable {

    private int id;
    private String movieTitle;
    private MovieDetails details;

    public Movie(int id, String movieTitle) {
        this.id = id;
        this.movieTitle = movieTitle;
    }

    public MovieDetails getDetails() {
        return details;
    }

    public void setDetails(MovieDetails details) {
        this.details = details;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
}
