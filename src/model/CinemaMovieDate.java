package model;


import java.util.Calendar;
import java.util.Date;

public class CinemaMovieDate {
    public Calendar start_time;
    public Calendar end_time;

    public CinemaMovieDate(int start, int end) {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        System.out.println(start + " " + end);
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.YEAR));
    }
}
