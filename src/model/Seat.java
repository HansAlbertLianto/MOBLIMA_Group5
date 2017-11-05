package model;

import java.io.Serializable;

public class Seat implements Serializable {
    private boolean isEmpty;

    public Seat() {

    }

    public void assignSeat() {
        isEmpty = true;
    }

    public boolean isEmpty(){
        return isEmpty;
    }

}
