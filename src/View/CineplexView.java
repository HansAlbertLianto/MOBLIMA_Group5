package View;

import java.util.ArrayList;

public class CineplexView extends View{
    private static final String message = "Here are the available cineplexes: ";
    
    public CineplexView() {
        super(message + "\n" + getCineplexList(), 1, 3);
    }
    
    public static String getCineplexList(){
    	return "";
    }

    @Override
    public void appear() {
        super.appear();
    }

    @Override
    protected void manageResponse() {

    }
}
