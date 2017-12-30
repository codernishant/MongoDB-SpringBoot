package com.nishant;

public class Review {

	private String username;
	private String review;
	private int rating;
	
	public Review(String username, String review, int rating) {
		super();
		this.username = username;
		this.review = review;
		this.rating = rating;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
}
