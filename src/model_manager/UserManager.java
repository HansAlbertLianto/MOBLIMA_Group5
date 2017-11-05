package model_manager;

import file_manager.FileManager;
import model.Person;
import model.index.Index;

public class UserManager {

    private static UserManager singleton = null;

    private Index index = Index.getInstance();
    private FileManager fileManager = FileManager.getInstance();

    public UserManager() { }

    public static UserManager getInstance() {
        if(singleton == null)
            singleton = new UserManager();
        return singleton;
    }

    public void doGetAllBookingHistory(Person user){

    }
}
