package file_manager;

import java.util.Optional;

public class PathManager {

    private static final String BASE_URL = ".//etc//file//";
    private static final String MOVIE_URL = "movie//";
    private static final String CINEPLEX_URL = "cineplex//";
    private static final String SEAT_URL = "seat//";

    private static final String INDEX_FILE = "index.dat";

    private static final String MOVIE_FILE = "movie_";
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
                        INDEX_FILE;
            case LOAD_MOVIE_DETAILS:
                return BASE_URL + MOVIE_URL +
                        MOVIE_FILE;
            case LOAD_ALL_CINEPLEX:
                return BASE_URL + CINEPLEX_URL +
                        INDEX_FILE;
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
                return BASE_URL + CINEPLEX_URL +
                        CINEPLEX_FILE + index + PATH + INDEX_FILE;
            default:
                return null;
        }
    }

    protected static String getPath(LoadType type,
                                    String index_1, String index_2) {
        switch (type) {
            case LOAD_ALL_CINEMA_MOVIE:
                return BASE_URL + CINEPLEX_URL + CINEPLEX_FILE + index_1 + PATH +
                        CINEMA_FILE + index_2 + PATH +
                        INDEX_FILE;
            default:
                return null;
        }
    }

    protected static String getPath(LoadType type,
                                    String index_1, String index_2, String index_3) {
        switch (type) {
            case LOAD_ALL_SEAT_LAYOUT:
                return BASE_URL + CINEPLEX_URL + CINEPLEX_FILE + index_1 + PATH +
                        CINEMA_FILE + index_2 + PATH +
                        CINEMA_MOVIE_FILE + index_3 + PATH +
                        INDEX_FILE;
            default:
                return null;
        }
    }
}
