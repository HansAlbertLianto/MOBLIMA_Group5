package file_manager;

import model.index.Index;

import java.io.*;

public class FileManager implements FileService {

    private static FileManager singleton = null;

    private FileManager() {
    }

    public static FileManager getInstance() {
        if (singleton == null) singleton = new FileManager();
        return singleton;
    }

    @Override
    public Object getData(LoadType qt, int index) {
        String path = PathManager.getPath(qt, index);
        return readSerializedObject(path);
    }

    @Override
    public void saveData(SaveType type, Object obj, int index) {
        String path = PathManager.getPath(type, index);
        writeSerializedObject(path, obj);
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
//            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
        }
        return data;
    }

    public void writeSerializedObject(String filename, Object obj) {
        try {
            FileOutputStream fiout = new FileOutputStream(filename);
            ObjectOutputStream myStream = new ObjectOutputStream(fiout);
            myStream.writeObject(obj);
            myStream.close();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }

    public void saveIndexFile(Index index){
        writeSerializedObject(PathManager.getBaseIndexFilePath(), index);
    }

    public Index loadIndexFile(){
        return (Index) readSerializedObject(PathManager.getBaseIndexFilePath());
    }
}
