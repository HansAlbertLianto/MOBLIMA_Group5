package file_manager;

import model.*;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        FileManager.getInstance().initializeIndex();
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
        FileManager.getInstance().saveData(SaveType.ADD_MOVIE, movie00);

        FileManager.getInstance().saveData(SaveType.ADD_MOVIE, movie01);
        FileManager.getInstance().saveData(SaveType.ADD_MOVIE, movie02);
        FileManager.getInstance().saveData(SaveType.ADD_MOVIE, movie03);
        FileManager.getInstance().saveData(SaveType.ADD_MOVIE, movie04);
        FileManager.getInstance().saveData(SaveType.ADD_MOVIE, movie05);
        ArrayList<Movie> movie = (ArrayList<Movie>) FileManager.getInstance().getData(LoadType.LOAD_ALL_MOVIES);
        for (Movie a: movie){
            System.out.println(a.getMovieTitle());
            System.out.println(a.getId());
        }
        
    	Cineplex cineplex1 = new Cineplex(1,"GV Jurong Point");
        Cinema cinema1 = new Cinema(1,"Cinema 01");
        Cinema cinema2 = new Cinema(2,"Cinema 02");
        Cinema cinema3 = new Cinema(3,"Cinema 03");
        FileManager.getInstance().saveData(SaveType.ADD_CINEPLEX, cineplex1);
        FileManager.getInstance().saveData(SaveType.ADD_CINEMA, cinema1, cineplex1.getId());
        FileManager.getInstance().saveData(SaveType.ADD_CINEMA, cinema2, cineplex1.getId());
        FileManager.getInstance().saveData(SaveType.ADD_CINEMA, cinema3, cineplex1.getId());

        Cineplex cineplex2 = new Cineplex(2,"Cathay JEM");
        Cinema cinema4 = new Cinema(4,"Cinema 04");
        Cinema cinema5 = new Cinema(5,"Cinema 05");
        Cinema cinema6 = new Cinema(6,"Cinema 06");
        FileManager.getInstance().saveData(SaveType.ADD_CINEPLEX, cineplex2);
        FileManager.getInstance().saveData(SaveType.ADD_CINEMA, cinema4, cineplex2.getId());
        FileManager.getInstance().saveData(SaveType.ADD_CINEMA, cinema5, cineplex2.getId());
        FileManager.getInstance().saveData(SaveType.ADD_CINEMA, cinema6, cineplex2.getId());
                
        Cineplex cineplex3 = new Cineplex(3,"GV Vivo City");
        Cinema cinema7 = new Cinema(7,"Cinema 07");
        Cinema cinema8 = new Cinema(8,"Cinema 08");
        Cinema cinema9 = new Cinema(9,"Cinema 09");
        FileManager.getInstance().saveData(SaveType.ADD_CINEPLEX, cineplex3);
        FileManager.getInstance().saveData(SaveType.ADD_CINEMA, cinema7.getId());
        FileManager.getInstance().saveData(SaveType.ADD_CINEMA, cinema8.getId());
        FileManager.getInstance().saveData(SaveType.ADD_CINEMA, cinema9.getId());
    }
}
