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
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        cal.set(Calendar.HOUR, shour);
        cal.set(Calendar.MINUTE, smin);
        this.start_time = cal;

        cal.set(Calendar.HOUR, ehour);
        cal.set(Calendar.MINUTE, emin);
        this.end_time = cal;
    }

    public CinemaMovieDate(int day, int shour, int smin, int ehour, int emin){
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR, shour);
        cal.set(Calendar.MINUTE, smin);
        this.start_time = cal;

        cal.set(Calendar.HOUR, ehour);
        cal.set(Calendar.MINUTE, emin);
        this.end_time = cal;
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
}
