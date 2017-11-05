package file_manager;
import java.util.*;
import java.io.Serializable;

public class Index implements Serializable{
	private int indexMovie;
	private int indexCineplex;
	private int indexCinemaMovie;
	private int indexCinema;
	private int indexReview;
	private int indexSeat;
	private int indexSeatLayout;
	private int indexPerson;
	public Index(int indexMovie, int indexCineplex, int indexCinemaMovie, int indexCinema, int indexReview, int indexSeat, int indexSeatLayout, int indexPerson){
		this.indexMovie = indexMovie;
		this.indexCineplex = indexCineplex;
		this.indexCinemaMovie = indexCinemaMovie;
		this.indexCinema = indexCinema;
		this.indexReview = indexReview;
		this.indexSeat = indexSeat;
		this.indexSeatLayout = indexSeatLayout;
		this.indexPerson = indexPerson;
	}
	public int getIndexMovie() {
		return indexMovie;
	}
	public void setIndexMovie(int indexMovie) {
		this.indexMovie = indexMovie;
	}
	public int getIndexCineplex() {
		return indexCineplex;
	}
	public void setIndexCineplex(int indexCineplex) {
		this.indexCineplex = indexCineplex;
	}

	public int getIndexCinema() {
		return indexCinema;
	}

	public int getIndexReview() {
		return indexReview;
	}

	public int getIndexSeat() {
		return indexSeat;
	}

	public int getIndexSeatLayout() {
		return indexSeatLayout;
	}

	public int getIndexPerson() {
		return indexPerson;
	}

	public int getIndexCinemaMovie() {
		return indexCinemaMovie;
	}
	public void setIndexCinemaMovie(int indexCinemaMovie) {
		this.indexCinemaMovie = indexCinemaMovie;
	}

	public void updateIndex(UpdateIndexType x){
		//System.out.println(index.getIndexMovie());
		switch (x){
			case UPDATE_MOVIE : this.indexMovie++; break;
			case UPDATE_CINEPLEX : this.indexCineplex++; break;
			case UPDATE_CINEMA_MOVIE : this.indexCinemaMovie++; break;
			case UPDATE_CINEMA : this.indexCinema++; break;
			case UPDATE_REVIEW : this.indexReview++; break;
			case UPDATE_SEAT : this.indexSeat++; break;
			case UPDATE_SEAT_LAYOUT : this.indexSeatLayout++; break;
			case UPDATE_PERSON : this.indexPerson++; break;
		}
		FileManager.writeSerializedObject(PathManager.getBaseIndexFilePath(), this);
	}
	
}
