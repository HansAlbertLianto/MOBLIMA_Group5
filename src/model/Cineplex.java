package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Cineplex implements Serializable {

    private int id;
    private String name;
    private ArrayList<Cinema> cinemas;

    public Cineplex(int id, String name) {
        this.id = id;
        this.name = name;
        this.cinemas = new ArrayList<Cinema>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCinema(Cinema cinema) {
        this.cinemas.add(cinema);
        cinema.setCineplex(this);
    }

    public ArrayList<Cinema> getCinemas() {
        return cinemas;
    }

    @Override
    public String toString() {
        return "Cineplex " + getName();
    }
}
