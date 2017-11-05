package model_manager;

import file_manager.FileManager;
import file_manager.LoadType;
import model.Cinema;
import model.Cineplex;
import model.Movie;

import java.util.ArrayList;

public class CinemaManager {

    private FileManager fileManager = FileManager.getInstance();

    public ArrayList<Cinema> getAllCinemas(Cineplex cineplex){
//        Object result = fileManager.getData(LoadType.LOAD_ALL_CINEMA, cineplex.getId());
//        if(result == null) return null;
//        ArrayList<Cinema> cinemas = (ArrayList<Cinema>) result;
//        return cinemas;
        return null;
    }

}
