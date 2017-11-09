package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

public class GeneralSetting implements Serializable {
    private double priceConfiguration;
    private ArrayList<Calendar> holidayList;
    //Price configuration can be translated into another class
    //which will be having attribute of each genre movies
    //such as price.3D (however we then need to implement movie genre
    //class in Movie)
}
