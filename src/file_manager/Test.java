package file_manager;

import model.*;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Movie movie = new Movie(0, "Title0");
        Movie movie1 = new Movie(1, "Title1");
        Movie movie2 = new Movie(2, "Title2");
        ArrayList<Movie> input = new ArrayList<Movie>();
        input.add(movie);
        input.add(movie1);
        input.add(movie2);

        System.out.println(PathManager.getIndexFilePath(Movie.class));
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
