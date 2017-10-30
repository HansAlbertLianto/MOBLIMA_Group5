package model;

public class Seat {
    protected int id;
    private int numEmptySeats;
    private int numAvailSeats;

    public Seat(int id, int numEmptySeats, int numAvailSeats) {
        this.id = id;
        this.numEmptySeats = numEmptySeats;
        this.numAvailSeats = numAvailSeats;
    }

    public void showSeatLayout() {

    }

    public void assignSeat() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumEmptySeats() {
        return numEmptySeats;
    }

    public void setNumEmptySeats(int numEmptySeats) {
        this.numEmptySeats = numEmptySeats;
    }

    public int getNumAvailSeats() {
        return numAvailSeats;
    }

    public void setNumAvailSeats(int numAvailSeats) {
        this.numAvailSeats = numAvailSeats;
    }
}
