package model;

public class Review {
    protected int id;
    private String reviewText;
    private int rating;
    private int movie_id;
    private int cust_id;

    public Review(int id, String reviewText, int rating, int movie_id, int cust_id) {
        this.id = id;
        this.reviewText = reviewText;
        this.rating = rating;
        this.movie_id = movie_id;
        this.cust_id = cust_id;
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
