package model;

import java.util.ArrayList;

public class MovieDetails {

    private MovieStatus showingStatus;
    private String synopsis;
    private ArrayList<Person> director = new ArrayList<Person>();
    private ArrayList<Person> cast = new ArrayList<Person>();

    private ArrayList<Review> reviewList = new ArrayList<Review>();

    private ArrayList<String> movieType = new ArrayList<String>();
    private ArrayList<Integer> totalRating = new ArrayList<Integer>();

    public MovieDetails(){

    }

    public ArrayList<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(ArrayList<Review> reviewList) {
        this.reviewList = reviewList;
    }

    public double getTotalRating() {
        double sum = 0;
        for(Integer i: totalRating){
            sum += i;
        }
        sum = sum / totalRating.size();
        return sum;
    }

    public void addTotalRating(int rating) {
        this.totalRating.add(rating);
    }

    public int getReviewCount() {
        return reviewList.size();
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public ArrayList<Person> getDirector() {
        return director;
    }

    public void setDirector(ArrayList<Person> director) {
        this.director = director;
    }

    public void addDirector(Person director){
        this.director.add(director);
    }

    public ArrayList<Person> getCast() {
        return cast;
    }

    public void setCast(ArrayList<Person> cast) {
        this.cast = cast;
    }

    public void addCast(Person cast){
        this.cast.add(cast);
    }

    public String getShowingStatus() {
        switch (this.showingStatus) {
            case ComingSoon:
                return Constants.COMING_SOON;
            case Preview:
                return Constants.PREVIEW;
            case NowShowing:
                return Constants.NOW_SHOWING;
            case EndOfShowing:
                return Constants.END_SHOWING;
            default:
                return Constants.COMING_SOON;
        }
    }

    public void setShowingStatus(MovieStatus showingStatus) {
        this.showingStatus = showingStatus;
    }

    public ArrayList<String> getMovieType() {
        return movieType;
    }

    public void setMovieType(ArrayList<String> movieType) {
        this.movieType = movieType;
    }

    public void addMovieType(String movieType){
        this.movieType.add(movieType);
    }

}
