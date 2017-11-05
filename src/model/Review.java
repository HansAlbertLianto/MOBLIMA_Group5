package model;

import java.io.Serializable;

public class Review implements Serializable{
    private String reviewText;
    private int rating;

    public Review(String reviewText, int rating, int movie_id, int cust_id) {
        this.reviewText = reviewText;
        this.rating = rating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
