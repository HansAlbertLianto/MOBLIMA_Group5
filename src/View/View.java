package View;

import MessageManager.MessageManager;

public abstract class View implements ViewInterface{
	protected String MENU_MSG;
	protected int from;
	protected int to;
	protected int response;
	
	private static final String ERROR_MSG = "";
	private static final String SUCCESS_MSG = "";
	
	private MessageManager Message = MessageManager.getInstance();
	
	public View(String msg, int from, int to) {
		this.MENU_MSG = msg;
		this.from = from;
		this.to = to;
		this.viewDidLoad();
	}
	
	protected void viewDidLoad() {
		Message.printMessage(MENU_MSG);
		response = Message.input(from, to);
	}
	public void printError() {
		Message.printMessage(ERROR_MSG);
	}
	
	public void printSuccess() {
		Message.printMessage(SUCCESS_MSG);
	}
	
	public void printDetails(String msg) {
		Message.printMessage(msg);
	}
}
