package file_manager;

public class PathManager {

    private static final String BASE_URL = ".//etc//file//";
    private static final String MOVIE_URL = "movie//";
    private static final String CINEPLEX_URL = "cineplex//";
    private static final String USER_URL = "user//";

    private static final String INDEX_FILE = "index.dat";

    private static final String MOVIE_FILE = "movie_";
    private static final String CINEPLEX_FILE = "cineplex_";
    private static final String USER_FILE = "user_";

//    private static final String DAT_EXT = "dat";
//    private static final String PATH = "//";

    protected static String getPath(LoadType type, int index) {
        switch (type) {
            case LOAD_MOVIES:
                return BASE_URL + MOVIE_URL +
                        MOVIE_FILE + Integer.toString(index);
            case LOAD_CINEPLEX:
                return BASE_URL + CINEPLEX_URL +
                        CINEPLEX_FILE + Integer.toString(index);
            case LOAD_USER:
                return BASE_URL + USER_URL +
                        USER_FILE + Integer.toString(index);
            default:
                return null;
        }
    }

    public static String getPath(SaveType type, int index) {
        switch (type) {
            case SAVE_MOVIE:
                return BASE_URL + MOVIE_URL +
                        MOVIE_FILE + Integer.toString(index);
            case SAVE_CINEPLEX:
                return BASE_URL + CINEPLEX_URL +
                        CINEPLEX_FILE + Integer.toString(index);
            case SAVE_USER:
                return BASE_URL + USER_URL +
                    USER_FILE + Integer.toString(index);
            default:
                return null;
        }
    }
    
    protected static String getBaseIndexFilePath(){
    	return BASE_URL + INDEX_FILE;
    }

}
