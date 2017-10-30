package file_manager;

import model.Movie;

import java.io.*;
import java.util.ArrayList;

public class FileManager implements FileService {

    private static FileManager singleton = null;

    private FileManager() {
    }

    public static FileManager getInstance() {
        if (singleton == null) singleton = new FileManager();
        return singleton;
    }

    @Override
    public Object getData(LoadType qt) {
		Index index = (Index) readSerializedObject(PathManager.getBaseIndexFilePath());
		ArrayList<Object> list = new ArrayList<Object>();
		String path = "";
		int indexNum = 0;
        switch (qt){
        	case LOAD_ALL_MOVIES : 
        		path = PathManager.getPath(LoadType.LOAD_ALL_MOVIES);
        		indexNum = index.getIndexMovie();
        		break;
        	case LOAD_ALL_CINEPLEX:
        		path = PathManager.getPath(LoadType.LOAD_ALL_CINEPLEX);
        		indexNum = index.getIndexCineplex();
        		break;
        	case LOAD_ALL_CINEMA_MOVIE_BY_CINEMA:
        		path = PathManager.getPath(LoadType.LOAD_ALL_CINEMA_MOVIE_BY_CINEMA);
        		indexNum = index.getIndexCinemaMovie();
        		break;
        }
        for (int i=0; i<=indexNum; i++){
    		Object obj = readSerializedObject(path + Integer.toString(i));
            list.add(obj);
		}
        
        return list;
    }

    @Override
    public Object getData(LoadType qt, int id) {
        return readSerializedObject(PathManager.getPath(qt, Integer.toString(id)));
    }

    @Override
    public Object getData(SearchType qt, String str) {
        return null;
    }

    @Override
    public void saveData(SaveType type, Object obj) {
		Index index = (Index) readSerializedObject(PathManager.getBaseIndexFilePath());
		String path = "";
        switch (type) {
            case ADD_MOVIE :
        	    if (index.getIndexMovie() < ( (Movie) obj).getId()) {
                    path = PathManager.getPath(type, Integer.toString(( (Movie) obj).getId()));
                    index.updateIndex(0);
                }
        		break;
        	case ADD_CINEPLEX:
        		path = PathManager.getPath(type, Integer.toString(index.getIndexCineplex()));
        		index.updateIndex(1);
        		break;
        	case ADD_MOVIE_TO_CINEMA_MOVIE:
        		path = PathManager.getPath(type, Integer.toString(index.getIndexCinemaMovie()));
        		index.updateIndex(2);
        		break;
        }
		writeSerializedObject(path, obj);
    }




    public void initializeIndex(){
    	Index index = new Index(-1,-1,-1);
    	writeSerializedObject(PathManager.getBaseIndexFilePath(), index);
    }

    private Object readSerializedObject(String filename) {
        Object data = null;
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            data = (Object) in.readObject();
            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return data;
    }

    public static void writeSerializedObject(String filename, Object obj) {
        try {
            FileOutputStream fiout = new FileOutputStream(filename);
            ObjectOutputStream myStream = new ObjectOutputStream(fiout);
            myStream.writeObject(obj);
            myStream.close();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }
}
