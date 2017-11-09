package model;

import model.index.Index;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Booking implements Serializable {
    private String booking_id; //XXXYYYYMMDDhhmm
    private CinemaMovie cinemaMovie;
    private ArrayList<Integer> seatBooked;
    private float price;

    public Booking(CinemaMovie cinemaMovie){
        this.cinemaMovie = cinemaMovie;
        String pattern = "yyyyMMddHHmm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        String cinemaId = cinemaMovie.getCinema().getId();
        this.booking_id = cinemaId + date;
    }

    //we need a method for calculating the price depends on cinema movie date,
    //user, and settings
    //it should be in the model
}
