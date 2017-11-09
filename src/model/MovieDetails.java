package model;

import java.io.Serializable;
import java.util.ArrayList;

public class MovieDetails implements Serializable {

    private MovieStatus showingStatus = MovieStatus.ComingSoon;
    private String synopsis;
    private String director;
    private String cast;
    private String movieType;

    private ArrayList<Review> reviewList = new ArrayList<Review>();
    private ArrayList<Integer> totalRating = new ArrayList<Integer>();

    public MovieDetails() {

    }

    public static String MovieStatus() {
        return "1. Coming Soon\n" +
                "2. Preview\n" +
                "3. Now Showing\n" +
                "4. End Of Showing\n";
    }

    public ArrayList<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(ArrayList<Review> reviewList) {
        this.reviewList = reviewList;
    }

    public double getTotalRating() {
        double sum = 0;
        for (Integer i : totalRating) {
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
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

    public void setShowingStatus(int status) {
        switch (status) {
            case 1:
                this.showingStatus = MovieStatus.ComingSoon;
                break;
            case 2:
                this.showingStatus = MovieStatus.Preview;
                break;
            case 3:
                this.showingStatus = MovieStatus.NowShowing;
                break;
            case 4:
                this.showingStatus = MovieStatus.EndOfShowing;
                break;
            default:
                break;
        }
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    @Override
    public String toString() {
        return "Showing Status: " + getShowingStatus() + "\n" +
                "Synopsis: " + getSynopsis() + "\n" +
                "Director: " + getDirector() + "\n" +
                "Cast: " + getCast() + "\n" +
                "Genre: " + getMovieType() + "\n";
    }
}
