package Navigator;

public interface NavigatorInterface {

    public void doAction(ActionTypes action);

    public void closeCurrentView();

    public void printError();

    public void printSuccess();

    public void printDetails(String msg);
}
