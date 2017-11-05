package model_manager;

import file_manager.FileManager;
import file_manager.LoadType;
import model.Cinema;
import model.Cineplex;
import model.Movie;
import model.index.Index;

import java.util.ArrayList;

public class CinemaManager{

    private static CinemaManager singleton = null;

    private Index index = Index.getInstance();
    private FileManager fileManager = FileManager.getInstance();

    public CinemaManager() { }

    public static CinemaManager getInstance() {
        if(singleton == null)
            singleton = new CinemaManager();
        return singleton;
    }

    public ArrayList<Cinema> getAllCinemas(Cineplex cineplex){
        return null;
    }

}
