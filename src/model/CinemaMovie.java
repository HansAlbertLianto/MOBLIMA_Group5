package model;

import java.io.Serializable;
import java.time.LocalTime;

public class CinemaMovie implements Serializable {
    private Cinema cinema;
    private Movie movie;
    private CinemaMovieDate date;
    private SeatLayout seatLayout;

    public CinemaMovie(Cinema cinema, Movie movie, int start, int end) {
        this.cinema = cinema;
        this.movie = movie;
        this.date = new CinemaMovieDate(start, end);
        this.seatLayout = new SeatLayout();
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

    public class CinemaMovieDate {
        public int date;
        public int month;
        public int year;
        public int start_time;
        public int end_time;

        public CinemaMovieDate(int start, int end) {
            LocalTime time = LocalTime.now();
        }

        public CinemaMovieDate(int date, int month, int year, int start, int end) {
            this.date = date;
            this.month = month;
            this.year = year;
            this.start_time = start;
            this.end_time = end;
        }
    }
}
