package Navigator;

public interface NavigatorInterface {
	public enum ActionTypes{
		OPEN_LOGIN,
		OPEN_HOME,
	}
	public void doAction(ActionTypes action);
	
	public void closeCurrentView();
	
	public void printError();
	
	public void printSuccess();
	
	public void printDetails(String msg);
}
