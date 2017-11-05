package model_manager;

import file_manager.FileManager;
import file_manager.LoadType;
import file_manager.SaveType;
import model.Movie;
import model.MovieDetails;
import model.Review;
import model.index.Index;
import model.index.UpdateIndexType;

import java.util.ArrayList;

public class MovieManager {

    private static MovieManager singleton = null;

    private Index index = Index.getInstance();
    private FileManager fileManager = FileManager.getInstance();

    public MovieManager() { }

    public static MovieManager getInstance() {
        if(singleton == null)
            singleton = new MovieManager();
        return singleton;
    }

    public ArrayList<Movie> getAllMovie(){
        ArrayList<Movie> movies = new ArrayList<Movie>();
        for(int i=0; i < index.getIndexMovie(); i++) {
            Movie movie = (Movie) fileManager.getData(LoadType.LOAD_MOVIES, i);
            if(movie != null) movies.add(movie);
        }
        return movies;
    }

    public ArrayList<Movie> getMovieBySearch(String query){
        ArrayList<Movie> movies = new ArrayList<Movie>();
        for(int i=0; i < index.getIndexMovie(); i++) {
            Movie movie = (Movie) fileManager.getData(LoadType.LOAD_MOVIES, i);
            if(movie != null)
                if(movie.getMovieTitle().contains(query))
                    movies.add(movie);
        }
        return movies;
    }

    public void addMovie(String title){
        Movie movie = new Movie(index.getIndexMovie(), title);
        index.updateIndex(UpdateIndexType.UPDATE_MOVIE);
        fileManager.saveData(SaveType.SAVE_MOVIE, movie, movie.getId());
    }

    public void addMovie(String title, MovieDetails details){
        Movie movie = new Movie(index.getIndexMovie(), title);
        movie.setDetails(details);
        index.updateIndex(UpdateIndexType.UPDATE_MOVIE);
        fileManager.saveData(SaveType.SAVE_MOVIE, movie, movie.getId());
    }

    public void changeDetailsMovie(Movie movie, MovieDetails movieDetails){
        movie.setDetails(movieDetails);
        fileManager.saveData(SaveType.SAVE_MOVIE, movie, movie.getId());
    }

    public void removeMovie(Movie movie){
        fileManager.saveData(SaveType.SAVE_MOVIE, null, movie.getId());
    }

    public void addReview(Movie movie, Review review){
        ArrayList<Review> reviews = movie.getDetails().getReviewList();
        reviews.add(review);
        movie.getDetails().setReviewList(reviews);
        fileManager.saveData(SaveType.SAVE_MOVIE, movie, movie.getId());
    }

    public void addRating(Movie movie, int rating){
        movie.getDetails().addTotalRating(rating);
        fileManager.saveData(SaveType.SAVE_MOVIE, movie, movie.getId());
    }
}
