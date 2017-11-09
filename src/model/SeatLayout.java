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

    //Thinking of way to divide the seat layout for each cinema
    //  1   2   3   4   5   6   7   8   9   10
    //  11  12  13  14  ... ... ... ... ... 20
    //  ...                                 30
    //  ...                                 40
    //  ...                                 50
    //  51  52  53  54  55  56  57  58  59  60

    //G ush ribet2 gpp dah
    //yg penting bisa disambung ke cinema movie
    //trs disambung ke user booking view

}
