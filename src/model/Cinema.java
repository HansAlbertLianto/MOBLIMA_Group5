package model;

import java.io.Serializable;

public class Cinema implements Serializable{
	protected int id;
	private String name;
	private Seat seat;
	
	public Cinema(int id, String cinema_name, Seat seat) {
		this.id = id;
		this.name = cinema_name;
<<<<<<< HEAD
		this.seat = seat;
=======
		//this.seat = new Seat();
>>>>>>> 85d2b5e972e56e3cd303eedc2b80620680df186f
	}
	
	public Cinema(String cinema_name, Seat seat) {
		this.name = cinema_name;
		this.seat = seat;
	}
	
	public String getName() { return this.name; }
	public Seat getSeat() { return this.seat; }
}
