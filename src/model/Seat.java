package model;

import java.io.Serializable;

public class Seat implements Serializable {
    private boolean isEmpty = true;

    public Seat() {

    }

    public void assignSeat() {
        isEmpty = false;
    }

    public boolean isEmpty(){
        return isEmpty;
    }

    //To-do toString
    //If empty
    //               _
    //              |E|
    //              |_|
    //Otherwise      _
    //              |/|
    //              |_|
    //Maybe ? ? ? ?
    // _
    //| |
}
