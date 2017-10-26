package View;

public class LandingView extends View {
	private static final String message =
            "Welcome to MOBLIMA !!! \n" +
                    "1. Admin Login \n" +
                    "2. Login as Movie goers";

    public LandingView() {
	    super(message,1,4);
	}
	
	protected void manageResponse(){
		switch(this.response){
            case 1: service.goLogin(); break;
            case 2: service.goUserHome(); break;
            default: break;
		}
	}
}
