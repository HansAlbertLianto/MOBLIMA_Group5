package model;

import java.io.Serializable;

public class Cinema implements Serializable{
	protected int id;
	private String name;
	private Seat seat;
	
	public Cinema(int id, String cinema_name, Seat seat) {
		this.id = id;
		this.name = cinema_name;
		this.seat = seat;
	}
	
	public Cinema(String cinema_name, Seat seat) {
		this.name = cinema_name;
		this.seat = seat;
	}
	
	public String getName() { return this.name; }
	public Seat getSeat() { return this.seat; }
}
