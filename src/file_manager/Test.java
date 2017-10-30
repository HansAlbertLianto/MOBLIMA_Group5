package file_manager;

import model.Movie;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie = new Movie(3, "Title");
		File.getInstance().saveData(movie);
	}

}
