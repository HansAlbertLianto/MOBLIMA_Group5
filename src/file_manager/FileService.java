package file_manager;

public interface FileService {
	public void getData(QueryType qt);
	public void getData(QueryType qt, int id);
	public void getData(QueryType qt, String str);
	public void saveData(Object obj);
	public void removeData(Object obj, int id);
}
