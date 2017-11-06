package message_manager;

import java.util.ArrayList;
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
            if(sc.hasNextInt()) {
                input = sc.nextInt();
                isValid = input>=from && input<=to;
            }
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
			if(sc.hasNextLine()){
                input = sc.nextLine();
                if(input.equals(""))
                    input = sc.nextLine();
                isValid = input.length() >= minLength && input.length() <= maxLength;
            }
			if (!isValid) {
                System.out.printf("Invalid input! Input length must be between %d and %d\n", minLength, maxLength);
            }
		}
		return input;
	}

	public String inputStringWithOption(ArrayList options, String caption){
		String input = "";
		boolean isValid = false;
		while (!isValid){
			System.out.printf(caption + " = ");
			input = sc.next();
			isValid = options.contains(input);
			if (!isValid){
				System.out.printf("Invalid input! Input must be in options\n");
			}
		}
		return input;
	}

	public ArrayList yesOrNoOption(){
		ArrayList options = new ArrayList();
		options.add("Y");
		options.add("y");
		options.add("N");
		options.add("n");
		return options;
	}
}
