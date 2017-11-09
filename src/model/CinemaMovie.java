package model;

import java.io.Serializable;
import java.time.LocalTime;

public class CinemaMovie implements Serializable {
    private Cinema cinema;
    private Movie movie;
    private CinemaMovieDate date;
    private SeatLayout seatLayout;

    public CinemaMovie(Cinema cinema, Movie movie) {
        this.cinema = cinema;
        this.movie = movie;
        this.seatLayout = new SeatLayout();
        cinema.addCinemaMovies(this);
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public CinemaMovieDate getDate() {
        return date;
    }

    public void setDate(CinemaMovieDate date) {
        this.date = date;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public SeatLayout getSeatLayout() {
        return seatLayout;
    }

    @Override
    public String toString() {
        return "\nMovie: " + movie.getMovieTitle() + "\n" +
                date.toString() + "\n";
    }

}
