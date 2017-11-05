package view;

import model.Movie;

import java.util.ArrayList;

public class SearchListMovieView extends View {
	private static final String message =
			"1. List all movies\n"+
			"2. Search movie\n";

	private final String movieSelectionMessage =
			"Select movie (0 to go back) = ";

	private ArrayList<Movie> movies;

	public SearchListMovieView(){
		super(message, 1,2);
	}
	@Override
	protected void manageResponse() {
		switch (response){
			case 1: printAllMovies(); break;
			case 2: searchMovie(); break;
			default: break;
		}

	}

	private void printAllMovies(){
		movies = service.doGetAllMovies();
		int number = 0;
		for(Movie movie : movies){
			number++;
			Message.printMessage(number + ". " + movie.getMovieTitle());
		}
		menuSelection(number);
	}

	private void searchMovie(){
		String query = Message.inputString(1,30,"Search");
		movies = service.doSearchMovie(query);
		int number = 0;
		for(Movie movie : movies){
			number++;
			Message.printMessage(number + ". " + movie.getMovieTitle());
		}
		menuSelection(number);
	}

	private void menuSelection(int number){
		Message.printMessage(movieSelectionMessage);
		int selection = Message.input(0, number);
		service.setCurrentMovie(movies.get(selection-1));
		service.goAdminEditRemoveMovie();
	}

}
