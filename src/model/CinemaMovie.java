package model;

import java.io.Serializable;
import java.time.LocalTime;

public class CinemaMovie implements Serializable{
	protected int id;
	private Cinema cinema;
	private Movie movie;

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

	private CinemaMovieDate date;
	
	public CinemaMovie(int id, Cinema cinema, Movie movie, int start, int end) {
		this.id = id;
		this.cinema = cinema;
		this.movie = movie;
		this.date = new CinemaMovieDate(start,end);
	}
}
