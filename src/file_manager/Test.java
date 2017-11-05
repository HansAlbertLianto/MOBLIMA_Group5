package file_manager;

import model.*;

import model_manager.CineplexManager;
import model_manager.MovieManager;

import java.util.ArrayList;

public class Test {

    private static MovieManager movieManager = MovieManager.getInstance();
    private static CineplexManager cineplexManager = CineplexManager.getInstance();

    public static void main(String[] args) {
//        populateMovie();
//        populateCineplexCinema();
        printAllMovie();
        printAllCineplex();
        printAllCinema(cineplexManager.getAllCineplex().get(0));
    }

    public static void populateMovie() {
        ArrayList<String> dumpTitleMovies = new ArrayList<String>();
        dumpTitleMovies.add("Avatar");
        dumpTitleMovies.add("Titanic");
        dumpTitleMovies.add("Frozen");
        dumpTitleMovies.add("Minions");
        dumpTitleMovies.add("SkyFall");
        dumpTitleMovies.add("Zootopia");
        dumpTitleMovies.add("Cinderella");
        dumpTitleMovies.add("Spectre");
        dumpTitleMovies.add("It");
        dumpTitleMovies.add("Logan");
        dumpTitleMovies.add("Deadpool");
        dumpTitleMovies.add("Jaws");
        dumpTitleMovies.add("Rings");
        dumpTitleMovies.add("Gifted");
        dumpTitleMovies.add("Baywatch");
        dumpTitleMovies.add("Focus");
        dumpTitleMovies.add("Moana");
        dumpTitleMovies.add("Sing");
        dumpTitleMovies.add("Nerve");
        dumpTitleMovies.add("Inferno");
        for(String title : dumpTitleMovies){
            movieManager.addMovie(title);
        }
    }
        public static void populateCineplexCinema() {
        Cineplex cineplex1 = new Cineplex(0, "GV Jurong Point");
        Cinema cinema1 = new Cinema("Cinema 01");
        Cinema cinema2 = new Cinema("Cinema 02");
        Cinema cinema3 = new Cinema("Cinema 03");
        cineplex1.addCinema(cinema1);
        cineplex1.addCinema(cinema2);
        cineplex1.addCinema(cinema3);
        cineplexManager.addCineplex(cineplex1);

        Cineplex cineplex2 = new Cineplex(1, "Cathay JEM");
        Cinema cinema4 = new Cinema("Cinema 04");
        Cinema cinema5 = new Cinema("Cinema 05");
        Cinema cinema6 = new Cinema("Cinema 06");
        cineplex2.addCinema(cinema4);
        cineplex2.addCinema(cinema5);
        cineplex2.addCinema(cinema6);
        cineplexManager.addCineplex(cineplex2);

        Cineplex cineplex3 = new Cineplex(2, "GV Vivo City");
        Cinema cinema7 = new Cinema("Cinema 07");
        Cinema cinema8 = new Cinema("Cinema 08");
        Cinema cinema9 = new Cinema("Cinema 09");
        cineplex3.addCinema(cinema7);
        cineplex3.addCinema(cinema8);
        cineplex3.addCinema(cinema9);
        cineplexManager.addCineplex(cineplex3);
    }

    public static void printAllMovie() {
        ArrayList<Movie> movies = movieManager.getAllMovie();
        for (Movie movie : movies) {
            System.out.println(movie.getMovieTitle());
        }
    }

    public static void printAllCineplex() {
        ArrayList<Cineplex> cineplexes = cineplexManager.getAllCineplex();
        for (Cineplex cineplex : cineplexes) {
            System.out.println(cineplex.getName());
        }
    }

    public static void printAllCinema(Cineplex cineplex) {
        for (Cinema cinema : cineplex.getCinemas())
            System.out.println(cinema.getName());
    }

}
