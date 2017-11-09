package model;

import model.index.Index;

import java.io.Serializable;
import java.util.ArrayList;

public class Booking implements Serializable {
    private String booking_id; //XXXYYYYMMDDhhmm
    private CinemaMovie cinemaMovie;
    private ArrayList<Integer> seatBooked;
    private float price;

    //we need a method for calculating the price depends on cinema movie date,
    //user, and settings
    //it should be in the model
}
