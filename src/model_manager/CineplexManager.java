package model_manager;

import file_manager.FileManager;
import file_manager.LoadType;
import file_manager.SaveType;
import model.CinemaMovie;
import model.Cineplex;
import model.index.Index;
import model.index.UpdateIndexType;

import java.util.ArrayList;

public class CineplexManager {

    private static CineplexManager singleton = null;

    private Index index = Index.getInstance();
    private FileManager fileManager = FileManager.getInstance();

    public CineplexManager() {
    }

    public static CineplexManager getInstance() {
        if (singleton == null)
            singleton = new CineplexManager();
        return singleton;
    }

    public ArrayList<Cineplex> getAllCineplex() {
        ArrayList<Cineplex> cineplexes = new ArrayList<Cineplex>();
        for (int i = 0; i < index.getIndexCineplex(); i++) {
            Cineplex cineplex = (Cineplex) fileManager.getData(LoadType.LOAD_CINEPLEX, i);
            if (cineplex != null) cineplexes.add(cineplex);
        }
        return cineplexes;
    }

    public void addCinemaMovie(Cineplex cineplex, CinemaMovie cinemaMovie){
        cinemaMovie.getCinema().addCinemaMovies(cinemaMovie);
        fileManager.saveData(SaveType.SAVE_CINEPLEX, cineplex, cineplex.getId());
    }

    public void addCineplex(Cineplex cineplex) {
        index.updateIndex(UpdateIndexType.UPDATE_CINEPLEX);
        fileManager.saveData(SaveType.SAVE_CINEPLEX, cineplex, cineplex.getId());
    }
}
