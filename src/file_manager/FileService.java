package file_manager;

import java.util.ArrayList;

public interface FileService {
    public Object getData(LoadType qt, int index);

    public void saveData(SaveType type, Object obj, int index);
}
