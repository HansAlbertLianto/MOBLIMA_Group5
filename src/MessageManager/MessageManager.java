package MessageManager;

import java.util.Scanner;

public class MessageManager {

	private static MessageManager singleton = null;
	private static Scanner sc = new Scanner(System.in);

	private MessageManager() {
	}

	public static MessageManager getInstance() {
		if (singleton == null)
			singleton = new MessageManager();
		return singleton;
	}

	public void printMessage(String msg) {
		System.out.println(msg);
	}

	public int input(int from, int to) {
		int input = -1;
		boolean isValid = false;
		while (!isValid){
			System.out.printf("Your choice = ");
			input = sc.nextInt();
			isValid = input>=from && input<=to;
			if (!isValid){
				System.out.printf("Invalid choice! Choice must be between %d and %d\n",from,to);
			}
		}
		return input;
	}

	public String inputString(int minLength, int maxLength, String caption){
		String input = "";
		boolean isValid = false;
		while (!isValid){
			System.out.printf(caption + " = ");
			input = sc.next();
			isValid = input.length() >= minLength && input.length() <= maxLength;
			if (!isValid){
				System.out.printf("Invalid input! Input length must be between %d and %d\n", minLength, maxLength);
			}
		}
		return input;
	}
}
