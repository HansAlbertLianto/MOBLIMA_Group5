package file_manager;

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
        Object result = new Object();
        return readSerializedObject(PathManager.getPath(qt));
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
        switch (type) {

        }
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
