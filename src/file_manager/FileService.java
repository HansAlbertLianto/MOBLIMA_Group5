package file_manager;

import java.util.ArrayList;

public interface FileService {
    public Object getData(LoadType qt);

    public Object getData(LoadType qt, int id);

    public Object getData(SearchType qt, String str);

    public void saveData(SaveType type, Object obj);
}
