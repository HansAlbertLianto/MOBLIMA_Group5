package model_manager;

import file_manager.FileManager;
import file_manager.LoadType;
import file_manager.SaveType;
import model.Person;
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

    public ArrayList<Person> getAllUser(){
        ArrayList<Person> persons = new ArrayList<Person>();
        for (int i=0; i < index.getIndexPerson(); i++){
            Person person = (Person) fileManager.getData(LoadType.LOAD_USER, i);
            if (person != null){
                persons.add(person);
            }
        }
        return persons;
    }

    public void addUser(String fullname, int age, String phoneNumber){
        Person person = new Person(index.getIndexPerson(), fullname, age, phoneNumber);
        index.updateIndex(UpdateIndexType.UPDATE_PERSON);
        fileManager.saveData(SaveType.SAVE_USER, person, person.getId());
    }
}
