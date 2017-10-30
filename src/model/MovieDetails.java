package model;

import java.util.ArrayList;

public class MovieDetails {
    private int id;
    private MovieStatus showingStatus;
    private String synopsis;
    private Person[] director;
    private Person[] cast;

    private ArrayList<Review> reviewList;

    private String movieType;
    private int totalRating;
    private int reviewCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(ArrayList<Review> reviewList) {
        this.reviewList = reviewList;
    }

    public int getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(int totalRating) {
        this.totalRating = totalRating;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Person[] getDirector() {
        return director;
    }

    public void setDirector(Person[] director) {
        this.director = director;
    }

    public Person[] getCast() {
        return cast;
    }

    public void setCast(Person[] cast) {
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

    public void setShowingStatus(MovieStatus showingStatus) {
        this.showingStatus = showingStatus;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public double getOverallRating() {
        if (reviewCount != 0) {
            return (totalRating / reviewCount);
        }
        return 0;
    }

    public void addRating(int number) {
        this.totalRating += number;
    }

    public void addReviewCount() {
        this.reviewCount++;
    }
}
