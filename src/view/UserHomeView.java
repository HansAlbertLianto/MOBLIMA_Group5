package view;

import service_.Service;

public class UserHomeView extends View {
	
	private static final String message = "Welcome to MOBLIMA, user! What would you like to do? \n" +
            "1. Search for Movies \n" +
            "2. List all Movies Showing";
	
	public UserHomeView(){
		super(message, 1 , 2);
	}
	@Override
	protected void manageResponse() {
		switch (this.response) {
		case 1: Service.goUserMoviesView(); break;
		case 2: service.goUserMoviesView(); break;
		default: break;
		}
	}

}
