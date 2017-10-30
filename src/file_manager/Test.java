package file_manager;

import model.*;

import java.nio.file.Path;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	//File.getInstance().initializeIndex();
        Movie movie = new Movie(0, "Title0");
    	Movie movie1 = new Movie(1, "Title1");
        Movie movie2 = new Movie(2, "Title2");
        //File.getInstance().saveData(SaveType.ADD_MOVIE, movie);
        //File.getInstance().saveData(SaveType.ADD_MOVIE, movie1);
        //File.getInstance().saveData(SaveType.ADD_MOVIE, movie2);
        ArrayList<Movie> input = (ArrayList<Movie>) File.getInstance().getData(LoadType.LOAD_ALL_MOVIES);
        for (Movie a: input){
        	System.out.println(a.getMovieTitle());
        }
        /*
        ArrayList<Movie> input = new ArrayList<Movie>();
        input.add(movie);
        input.add(movie1);
        input.add(movie2);*/

        System.out.println(PathManager.getIndexFilePath(Movie.class));
        // After get the index path, you need to load the index file,
        // then iterate as much as the integer in index file,
        // then get the file using path (LoadType.LOAD_ALL_MOVIES) and extend it with integer,
        // such as, movie_0, ... , movie_n
        // then add it to array list.
        // return it.
        System.out.println(PathManager.getPath(LoadType.LOAD_ALL_MOVIES));
        System.out.println(PathManager.getPath(LoadType.LOAD_MOVIE_DETAILS));

        System.out.println(PathManager.getIndexFilePath(Cineplex.class));
        System.out.println(PathManager.getPath(LoadType.LOAD_ALL_CINEPLEX));

        System.out.println(PathManager.getIndexFilePath(Cinema.class, 0));
        System.out.println(PathManager.getPath(LoadType.LOAD_ALL_CINEMA, "0"));

        System.out.println(PathManager.getIndexFilePath(CinemaMovie.class, 0));
        System.out.println(PathManager.getPath(LoadType.LOAD_ALL_CINEMA_MOVIE, "0"));

        System.out.println(PathManager.getIndexFilePath(SeatLayout.class, 0));
        System.out.println(PathManager.getPath(LoadType.LOAD_ALL_SEAT_LAYOUT, "0"));
    }
}
