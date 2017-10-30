package model;

public class Movie {
	

	private int movieID;
	private String movieTitle;
	private MovieStatus showingStatus;
	private String synopsis;
	private Person[] director;
	private Person[] cast;
	//private ReviewList reviewList;
	private String movieType;
	private int totalRating;
	private int reviewCount;
	
	public Movie(int movieID){
		this.movieID = movieID;
	}
	public int getMovieID(){
		return movieID;
	}
	
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
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
		switch(this.showingStatus){
		case ComingSoon: return Constants.COMING_SOON;
		case Preview: return Constants.PREVIEW;
		case NowShowing: return Constants.NOW_SHOWING;
		case EndOfShowing: return Constants.END_SHOWING;
		default: return Constants.COMING_SOON;
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
	
	public double getOverallRating(){
		if (reviewCount != 0){
			return (totalRating / reviewCount);
		}
		return 0;
	}
	
	public void addRating(int number){
		this.totalRating += number;
	}
	
	public void addReviewCount(){
		this.reviewCount++;
	}
	
	/*
	public double getOverallRating(){
		if (isListEmpty()) return 0;
		int totalRating = 0;
		int totalReviews = getReviewsLength();
		Review[] reviews = new Review[totalReviews];
		reviews = getReviews();
		for (Review review: reviews){
			totalRating += review.getRating();
		}
		double overallRating = totalRating/totalReviews;
		overallRating = (double) Math.round(overallRating * 10)/10;
		return (overallRating);
	}
	
	public void addToReviewList(Review review){
		ReviewList newList = new ReviewList(review);
		if(isListEmpty()){
			this.reviewList = newList;
		}
		else{
			this.reviewList.insertToLast(newList);
		}
	}
	public Review[] getReviews(){
		int reviewsLength = getReviewsLength();
		Review[] reviewArray = new Review[reviewsLength];
		if (isListEmpty()) return null;
		else{
			ReviewList newList;
			newList = this.reviewList;
			int index = 0;
			do{
				reviewArray[index] = newList.getReview();
				index++;
			} while (newList != null);
		}
		return reviewArray;
	}
	public boolean isListEmpty(){
		if (this.reviewList == null) return true;
		return false;
	}
	public int getReviewsLength(){
		if (!isListEmpty()){
			return reviewList.getLength();
		}
		return 0;
	}
	*/
}
