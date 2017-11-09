package model;

import java.io.Serializable;
import java.util.ArrayList;

public class SeatLayout implements Serializable {
    private ArrayList<ArrayList<Seat>> seats = new ArrayList<ArrayList<Seat>>();
    private final int ROW = 4;
    private final int COLUMN = 10;

    public SeatLayout(){
        for(int i=0; i<ROW; i++){
            ArrayList<Seat> temp = new ArrayList<Seat>();
            for(int j=0; j<COLUMN; j++){
                temp.add(new Seat());
            }
            seats.add(temp);
        }
    }

    public ArrayList<ArrayList<Seat>> getSeats() {
        return seats;
    }

    public int getNumAvailSeats() {
        int sum = 0;
        for(ArrayList<Seat> arrayList : seats){
            for(Seat seat: arrayList)
                if(seat.isEmpty()) sum++;
        }
        return sum;
    }

    public void assignSeat(int row, int column){
        if(ROW<row || COLUMN<column) {
            System.out.printf("Error, select row less than equal %d and column less than equal %d\n", ROW, COLUMN);
            return;
        }
        seats.get(row-1).get(column-1).assignSeat();
    }

    @Override
    public String toString() {
        String string = "";
        for(ArrayList<Seat> arrayList : seats){
            string += "\n";
            for(int j=0; j<10; j++){
                string += " _ ";
            }
            string += "\n";
            for(Seat seat: arrayList){
                if(seat.isEmpty())
                    string += "|E|";
                else
                    string += "| |";
            }
            string += "\n";
            for(int j=0; j<10; j++){
                string += "|_|";
            }
            string += "\n";
        }
        return string;
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
