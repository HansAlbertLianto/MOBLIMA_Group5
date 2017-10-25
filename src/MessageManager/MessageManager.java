package MessageManager;

public class MessageManager {
	
	private static MessageManager singleton = null;
	
	private MessageManager() {}
	
	public static MessageManager getInstance() {
		if(singleton == null) singleton = new MessageManager();
		return singleton;
	}
	
	public void printMessage(String msg) {
		System.out.println(msg);
	}

	public int input(int from, int to) {
		
		return -1;
	}
}
