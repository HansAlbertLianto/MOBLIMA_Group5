package model;

import java.io.Serializable;
import java.util.ArrayList;

public class SeatLayout implements Serializable {
    private ArrayList<Seat> seats = new ArrayList<Seat>();

    public SeatLayout(){

    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public int getNumAvailSeats() {
        int sum = 0;
        for(Seat i : seats){
            if(i.isEmpty()) sum++;
        }
        return sum;
    }

}
