package model;


import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CinemaMovieDate implements Serializable {
    private Calendar start_time;
    private Calendar end_time;

    public CinemaMovieDate(int shour, int smin, int ehour, int emin) {
        Date date = new Date();
        Calendar scal = Calendar.getInstance();
        scal.setTime(date);
        Calendar ecal = Calendar.getInstance();
        ecal.setTime(date);

        scal.set(Calendar.HOUR, shour);
        scal.set(Calendar.MINUTE, smin);
        this.start_time = scal;

        ecal.set(Calendar.HOUR, ehour);
        ecal.set(Calendar.MINUTE, emin);
        this.end_time = ecal;
    }

    public CinemaMovieDate(int day, int shour, int smin, int ehour, int emin){
        Date date = new Date();
        Calendar scal = Calendar.getInstance();
        scal.setTime(date);
        Calendar ecal = Calendar.getInstance();
        ecal.setTime(date);

        scal.set(Calendar.DAY_OF_MONTH, day);
        scal.set(Calendar.HOUR, shour);
        scal.set(Calendar.MINUTE, smin);
        this.start_time = scal;

        ecal.set(Calendar.HOUR, ehour);
        ecal.set(Calendar.MINUTE, emin);
        this.end_time = ecal;
    }

    public CinemaMovieDate(int day, int month, int shour, int smin, int ehour, int emin){
        Date date = new Date();
        Calendar scal = Calendar.getInstance();
        scal.setTime(date);
        Calendar ecal = Calendar.getInstance();
        ecal.setTime(date);

        scal.set(Calendar.DAY_OF_MONTH, day);
        scal.set(Calendar.MONTH, month);
        scal.set(Calendar.HOUR, shour);
        scal.set(Calendar.MINUTE, smin);
        this.start_time = scal;

        ecal.set(Calendar.HOUR, ehour);
        ecal.set(Calendar.MINUTE, emin);
        this.end_time = ecal;
    }

    public boolean isDateToday(){
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        if(start_time.get(Calendar.DATE) == cal.get(Calendar.DATE) &&
                start_time.get(Calendar.MONTH) == cal.get(Calendar.MONTH) &&
                start_time.get(Calendar.YEAR) == cal.get(Calendar.YEAR))
            return true;
        return false;
    }

    public boolean isDateTomorrow(){
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        if(start_time.get(Calendar.DATE) + 1 == cal.get(Calendar.DATE) &&
                start_time.get(Calendar.MONTH) == cal.get(Calendar.MONTH) &&
                start_time.get(Calendar.YEAR) == cal.get(Calendar.YEAR))
            return true;
        return false;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String startDate = sdf.format(this.start_time.getTime());
        String endDate = sdf.format(this.end_time.getTime());
        return "Start time: " + startDate + "\n" +
                "End time: " + endDate + "\n";
    }

    public Calendar getStartTime() {
        return start_time;
    }
}
