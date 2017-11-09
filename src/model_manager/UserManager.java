package model_manager;

import file_manager.FileManager;
import file_manager.LoadType;
import file_manager.SaveType;
import model.User;
import model.index.Index;
import model.index.UpdateIndexType;

import java.util.ArrayList;

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

    public ArrayList<User> getAllUser(){
        ArrayList<User> users = new ArrayList<User>();
        for (int i = 0; i < index.getIndexUser(); i++){
            User user = (User) fileManager.getData(LoadType.LOAD_USER, i);
            if (user != null){
                users.add(user);
            }
        }
        return users;
    }

    public void addUser(String fullname, int age, String phoneNumber){
        User user = new User(index.getIndexUser(), fullname, age, phoneNumber);
        index.updateIndex(UpdateIndexType.UPDATE_USER);
        fileManager.saveData(SaveType.SAVE_USER, user, user.getId());
    }
}
