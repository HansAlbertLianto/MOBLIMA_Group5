package file_manager;

import model.*;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Movie movie00 = new Movie(0, "Avatar");
        Movie movie01 = new Movie(1, "Titanic");
        Movie movie02 = new Movie(2, "Frozen");
        Movie movie03 = new Movie(3, "Minions");
        Movie movie04 = new Movie(4, "Skyfall");
        Movie movie05 = new Movie(5, "Zootopia");
        Movie movie06 = new Movie(6, "Cinderella");
        Movie movie07 = new Movie(7, "Spectre");
        Movie movie08 = new Movie(8, "It");
        Movie movie09 = new Movie(9, "Logan");
        Movie movie10 = new Movie(10, "Deadpool");
        Movie movie11 = new Movie(11, "Jaws");
        Movie movie12 = new Movie(12, "Rings");
        Movie movie13 = new Movie(13, "Gifted");
        Movie movie14 = new Movie(14, "Baywatch");
        Movie movie15 = new Movie(15, "Focus");
        Movie movie16 = new Movie(16, "Moana");
        Movie movie17 = new Movie(17, "Sing");
        Movie movie18 = new Movie(18, "Nerve");
        Movie movie19 = new Movie(19, "Inferno");

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
