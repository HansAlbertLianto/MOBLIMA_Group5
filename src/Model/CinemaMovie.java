package Model;

import java.time.LocalTime;

public class CinemaMovie {
	private Cinema cinema;
	private Movie movie;
	private CinemaMovieDate date;
	
	public CinemaMovie(Cinema cinema, Movie movie, int start, int end) {
		this.cinema = cinema;
		this.movie = movie;
		this.date = new CinemaMovieDate(start,end);
	}
}

class CinemaMovieDate{
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
