package file_manager;

import model.CinemaMovie;
import model.Movie;
import navigator.Navigator;
import view.View;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Stack;

public class File implements FileService {

    private static File singleton = null;

    private File() {
    }

    public static File getInstance() {
        if (singleton == null) singleton = new File();
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
        for (int i=0; i<indexNum; i++){
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
        		path = PathManager.getPath(type, Integer.toString(index.getIndexMovie()));
        		updateIndex(index, 0);
        		break;        	
        	case ADD_CINEPLEX:
        		path = PathManager.getPath(type, Integer.toString(index.getIndexCineplex()));
        		updateIndex(index, 1);
        		break;
        	case ADD_MOVIE_TO_CINEMA_MOVIE:
        		path = PathManager.getPath(type, Integer.toString(index.getIndexCinemaMovie()));
        		updateIndex(index, 2);
        		break;
        }
		writeSerializedObject(path, obj);
    }
    
    public void updateIndex(Index index, int type){
    	//System.out.println(index.getIndexMovie());
    	if (type==0){
    		index.setIndexMovie(index.getIndexMovie()+1);
    	}
    	else if (type == 1){
    		index.setIndexCineplex(index.getIndexCineplex()+1);
    	}
    	else if (type == 2){
    		index.setIndexCinemaMovie(index.getIndexCinemaMovie() + 1);
    	}
    	writeSerializedObject(PathManager.getBaseIndexFilePath(), index);
    }
    
    
    public void initializeIndex(){
    	Index index = new Index(0,0,0);
    	writeSerializedObject(PathManager.getBaseIndexFilePath(), index);
    }

    private Object readSerializedObject(String filename) {
        Object data = null;
        FileInputStream fis = null;
        ObjectInputStream in = null;
        System.out.println(filename);
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

    private void writeSerializedObject(String filename, Object obj) {
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
