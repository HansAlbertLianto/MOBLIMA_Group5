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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
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
