package View;

import MessageManager.MessageManager;
import Service.Service;

public abstract class View implements ViewInterface {
    protected String MENU_MSG;
    protected int from;
    protected int to;
    protected int response;

    protected static Service service = Service.getInstance();

    private static final String ERROR_MSG = "";
    private static final String SUCCESS_MSG = "";

    protected MessageManager Message = MessageManager.getInstance();

    public View(){ }
    public View(String msg, int from, int to) {
        this.MENU_MSG = msg;
        this.from = from;
        this.to = to;
    }

    @Override
    public void appear() {
        Message.printMessage(MENU_MSG);
        response = Message.input(from, to);
        manageResponse();
    }

    @Override
    public void printError() {
        Message.printMessage(ERROR_MSG);
    }

    @Override
    public void printSuccess() {
        Message.printMessage(SUCCESS_MSG);
    }

    @Override
    public void printDetails(String msg) {
        Message.printMessage(msg);
    }

    protected abstract void manageResponse();
}
