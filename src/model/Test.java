package model;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String args[]) {
        GeneralSetting setting = new GeneralSetting();
        CinemaMovieDate cinema1 = new CinemaMovieDate(9, 10, 10, 0, 11, 30);
        CinemaMovieDate cinema2 = new CinemaMovieDate(10, 10, 10, 0, 11,  30);
        CinemaMovieDate cinema3 = new CinemaMovieDate(11, 10, 10, 10,11,40);
        CinemaMovieDate cinema4 = new CinemaMovieDate(12, 10, 10, 10, 11, 40);
        CinemaMovieDate cinema5 = new CinemaMovieDate(13, 10,10, 10, 11, 40);
        CinemaMovieDate cinema6 = new CinemaMovieDate(14, 10, 10, 0 , 11, 30);
        CinemaMovieDate cinema7 = new CinemaMovieDate(15, 10,10, 10, 13,0);

        Date date = new Date();

        Calendar cal1 = Calendar.getInstance();
        cal1.set(2017, 10, 9);
        setting.addHoliday(cal1);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(2017, 10, 10);
        setting.addHoliday(cal2);

        Calendar cal3 = Calendar.getInstance();
        cal3.set(2017, 10, 15);
        setting.addHoliday(cal3);

        System.out.println(setting.getPrice(cinema1));
        System.out.println(setting.getPrice(cinema2));
        System.out.println(setting.getPrice(cinema3));
        System.out.println(setting.getPrice(cinema4));
        System.out.println(setting.getPrice(cinema5));
        System.out.println(setting.getPrice(cinema6));
        System.out.println(setting.getPrice(cinema7));
        System.out.println("---");

        setting.deleteHoliday(cal1);
        setting.deleteHoliday(cal2);
        setting.deleteHoliday(cal3);

        System.out.println(setting.getPrice(cinema1));
        System.out.println(setting.getPrice(cinema2));
        System.out.println(setting.getPrice(cinema3));
        System.out.println(setting.getPrice(cinema4));
        System.out.println(setting.getPrice(cinema5));
        System.out.println(setting.getPrice(cinema6));
        System.out.println(setting.getPrice(cinema7));

        //Create cinemamovie date
        //try add some holiday
        //then check it
        //create generalsetting MANAGER
        //
    }

}
