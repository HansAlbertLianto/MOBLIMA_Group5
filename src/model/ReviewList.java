package model;

public class ReviewList {
    public ReviewList next;
    protected int id;
    private Review review;
    private int length;

    public ReviewList(int id, Review review) {
        this.id = id;
        this.review = review;
        this.length = 1;
        this.next = null;
    }

    public void insertToLast(ReviewList last) {
        ReviewList temp = this;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = last;
        this.length += 1;
    }

    public int getLength() {
        return length;
    }

    public Review getReview() {
        return review;
    }
}
