package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

public class GeneralSetting implements Serializable {
    private static final double priceConfiguration = 7.00;
    private ArrayList<Calendar> holidayList = new ArrayList<Calendar>();
    //Price configuration can be translated into another class
    //which will be having attribute of each genre movies
    //such as price.3D (however we then need to implement movie genre
    //class in Movie)

    public GeneralSetting() {}

    public double getPrice(CinemaMovieDate cinemaMovieDate){
        int i = 0;
        while(i < holidayList.size()) {
            if(holidayList.get(i).get(Calendar.DATE) == cinemaMovieDate.getStartTime().get(Calendar.DATE) &&
                    holidayList.get(i).get(Calendar.MONTH) == cinemaMovieDate.getStartTime().get(Calendar.MONTH) &&
                    holidayList.get(i).get(Calendar.YEAR) == cinemaMovieDate.getStartTime().get(Calendar.YEAR))
                return priceConfiguration * 1.1;
            i++;
        }

        if(cinemaMovieDate.getStartTime().get(Calendar.DAY_OF_WEEK) == 1 ||
                cinemaMovieDate.getStartTime().get(Calendar.DAY_OF_WEEK) == 7)
            return priceConfiguration * 1.1;

        return priceConfiguration;
    }

    public void deleteHoliday(Calendar calendar) { holidayList.remove(calendar); }

    public void addHoliday(Calendar calendar) { holidayList.add(calendar); }
}
