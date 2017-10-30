package model;

import java.io.Serializable;

public class Cinema implements Serializable {
    private int id;
    private String name;
    private Seat seat;

    public Cinema(int id, String cinema_name) {
        this.id = id;
        this.name = cinema_name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public Seat getSeat() {
        return this.seat;
    }
}
