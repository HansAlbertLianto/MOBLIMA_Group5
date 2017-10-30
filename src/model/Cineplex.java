package model;

import java.io.Serializable;
import java.util.ArrayList;
import model.Cinema;

public class Cineplex implements Serializable {

	protected int id;
	private ArrayList<Cinema> cinemaList;

	public Cineplex(int id, ArrayList<Cinema> cinemaList) {
		this.id = id;
		this.cinemaList = cinemaList;
	}
}
