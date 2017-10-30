package view;

import message_manager.MessageManager;
import service.Service;

public abstract class View implements ViewInterface {
    protected String MENU_MSG;
    protected int from = 0;
    protected int to = 0;
    protected int response;

    protected static Service service = Service.getInstance();

    private static final String ERROR_MSG = "Error !!!\n";
    private static final String SUCCESS_MSG = "Success !!!\n";

    protected MessageManager Message = MessageManager.getInstance();

    public View() {
    }

    public View(String msg) {
        this.MENU_MSG = msg;
    }

    public View(String msg, int from, int to) {
        this.MENU_MSG = msg;
        this.from = from;
        this.to = to;
    }

    @Override
    public void appear() {
        Message.printMessage(MENU_MSG);
        if (from == 0 || to == 0) return;
        response = Message.input(from, to);
        manageResponse();
    }

    @Override
    public void handleError() {
        Message.printMessage(ERROR_MSG);
    }

    @Override
    public void handleSuccess() {
        Message.printMessage(SUCCESS_MSG);
    }

    @Override
    public void printDetails(String msg) {
        Message.printMessage(msg);
    }

    protected abstract void manageResponse();
}
