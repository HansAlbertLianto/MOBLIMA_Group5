package file_manager;

import model.*;

public class PathManager {

    private static final String BASE_URL = ".//etc//file//";
    private static final String MOVIE_URL = "movie//";
    private static final String MOVIE_DETAILS_URL = "movie//";
    private static final String CINEPLEX_URL = "cineplex//";
    private static final String CINEMA_URL = "cinema//";
    private static final String CINEMA_MOVIE_URL = "cinema-movie//";
    private static final String SEAT_URL = "seat//";

    private static final String INDEX_FILE = "index.dat";

    private static final String MOVIE_FILE = "movie_";
    private static final String MOVIE_DETAILS_FILE = "movie_details_";
    private static final String CINEPLEX_FILE = "cineplex_";
    private static final String CINEMA_FILE = "cinema_";
    private static final String CINEMA_MOVIE_FILE = "cinema_movie_";
    private static final String SEAT_FILE = "seat_";

    private static final String DAT_EXT = "dat";
    private static final String PATH = "//";

    protected static String getPath(LoadType type) {
        switch (type) {
            case LOAD_ALL_MOVIES:
                return BASE_URL + MOVIE_URL +
                        MOVIE_FILE;
            case LOAD_MOVIE_DETAILS:
                return BASE_URL + MOVIE_DETAILS_URL +
                        MOVIE_DETAILS_FILE;
            case LOAD_ALL_CINEPLEX:
                return BASE_URL + CINEPLEX_URL +
                        CINEPLEX_FILE;
            case LOAD_BOOKING_HISTORY:
                return null;
            default:
                return null;
        }
    }

    protected static String getPath(LoadType type,
                                    String index) {
        switch (type) {
            case LOAD_ALL_CINEMA:
                return BASE_URL + CINEMA_URL + CINEPLEX_FILE + index + PATH +
                        CINEMA_FILE;
            case LOAD_ALL_CINEMA_MOVIE:
                return BASE_URL + MOVIE_URL + CINEMA_FILE + index + PATH +
                        CINEMA_MOVIE_FILE;
            case LOAD_ALL_SEAT_LAYOUT:
                return BASE_URL + SEAT_URL + CINEMA_MOVIE_URL + index + PATH +
                        SEAT_FILE;
            default:
                return null;
        }
    }

    public static String getPath(SaveType type, String index) {
        switch (type) {
            case ADD_MOVIE:
            case REMOVE_MOVIE:
            case EDIT_MOVIE:
                return BASE_URL + MOVIE_URL + MOVIE_FILE + index + PATH;

            case ADD_CINEPLEX:
                return BASE_URL + CINEPLEX_URL + CINEPLEX_FILE + index + PATH;

            case ADD_REVIEW:
            case ADD_RATING:

            case PURCHASE:
            case ADD_MOVIE_TO_CINEMA_MOVIE:
            case CHANGE_CINEMA_MOVIE:
            case CHANGE_TICKET_PRICES:
            case CHANGE_GENERAL_SETTING:

            default:
                return null;
        }
    }

    public static String getPath(SaveType type, String index1, String index2){
        switch (type){
            case ADD_CINEMA:
                return BASE_URL + CINEMA_URL + CINEPLEX_FILE + index1 + PATH + CINEMA_FILE + index2 + PATH;

            default:
                return null;
        }
    }
    
    protected static String getBaseIndexFilePath(){
    	return BASE_URL + INDEX_FILE;
    }

    protected static String getIndexFilePath(Class type){
        if(type.equals(Movie.class)){
            return BASE_URL + MOVIE_URL + INDEX_FILE;
        }
        if(type.equals(Cineplex.class)){
            return BASE_URL + CINEPLEX_URL + INDEX_FILE;
        }
        return null;
    }

    protected static String getIndexFilePath(Class type, int index){
        if(type.equals(Cinema.class)){
            return BASE_URL + CINEMA_URL + CINEPLEX_FILE +
                    Integer.toString(index) + PATH + INDEX_FILE;
        }
        if(type.equals(CinemaMovie.class)){
            return BASE_URL + CINEMA_MOVIE_URL + CINEMA_URL +
                    Integer.toString(index) + PATH + INDEX_FILE;
        }
        if(type.equals(SeatLayout.class)){
            return BASE_URL + SEAT_URL + CINEMA_MOVIE_URL +
                    Integer.toString(index) + PATH + INDEX_FILE;
        }
        if(type.equals(Cineplex.class)){
            return BASE_URL + CINEPLEX_URL + INDEX_FILE;
        }
        return null;
    }
}
