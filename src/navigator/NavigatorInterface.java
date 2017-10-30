package navigator;

public interface NavigatorInterface {

    public void doAction(ActionTypes action);

    public void handleError();

    public void handleSuccess();

    public void printDetails(String msg);
}
