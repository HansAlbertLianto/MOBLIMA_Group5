package View;

public class LandingView extends View {
	private static final String message =
            "Welcome to MOBLIMA !!! \n" +
                    "1. Login \n" +
                    "2. Register \n" +
                    "3. Forgot Password \n" +
                    "4. Exit \n";

    public LandingView() {
	    super(message,1,4);
	}
	
	protected void manageResponse(){
		switch(this.response){
            case 1: service.goLogin(); break;
            case 2: service.goRegister(); break;
            case 3: service.goForgot(); break;
            case 4: service.goExit(); break;
            default: break;
		}
	}
}
