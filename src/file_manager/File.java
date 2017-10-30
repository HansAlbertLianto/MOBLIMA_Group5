package file_manager;

import model.Movie;
import navigator.Navigator;
import view.View;

import java.io.*;
import java.util.Stack;
public class File implements FileService{
	
    private static File singleton = null;

    private File() {
    }

    public static File getInstance() {
        if (singleton == null) singleton = new File();
        return singleton;
    }

	@Override
	public void getData(QueryType qt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getData(QueryType qt, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getData(QueryType qt, String str) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void saveData(Object obj){
		String filename = new String();
		if (obj instanceof Movie) filename = "movie.dat";
		
		try{
			FileOutputStream fiout = new FileOutputStream(filename);
			ObjectOutputStream myStream = new ObjectOutputStream(fiout);
			myStream.writeObject(obj);
			myStream.close();
		}
		catch (FileNotFoundException e){
			
		}
		catch (IOException e){
			
		}
	}

	@Override
	public void removeData(Object obj, int id) {
		// TODO Auto-generated method stub
		
	}
}
