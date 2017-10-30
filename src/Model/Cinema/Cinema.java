package Model.Cinema;

import Model.Seat.Seat;

public class Cinema {
	private String name;
	private Seat seat;
	
	public Cinema(String cinema_name) {
		this.name = cinema_name;
		//this.seat = new Seat();
	}
	
	public Cinema(String cinema_name, Seat seat) {
		this.name = cinema_name;
		this.seat = seat;
	}
	
	public String getName() { return this.name; }
	public Seat getSeat() { return this.seat; }
}
