package model;

import java.util.ArrayList;

public class SeatLayout {
    protected int id;
    private ArrayList<Seat> seats;

    public SeatLayout(int id, ArrayList<Seat> seats) {
        this.id = id;
        this.seats = seats;
    }
}
