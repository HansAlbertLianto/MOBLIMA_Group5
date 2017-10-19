package Model;

public class Review {
	private String reviewText;
	private int rating;
	private int movie_id;
	private int cust_id;
	//user
	public Review(int cust_id, int movie_id){
		this.cust_id = cust_id;
		this.movie_id = movie_id;
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
