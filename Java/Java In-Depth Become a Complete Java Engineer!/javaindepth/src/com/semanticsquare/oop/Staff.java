package com.semanticsquare.oop;

public class Staff extends User {
	@Override
	public void printUserType() {
		System.out.println("Staff");
	}
	
	@Override
	public Review postAReview(String reviewText) {
	   System.out.println("Staff: postAReview");
	   Review review = super.postAReview(reviewText);
	   review.setApproved(true);
	   return review;
	   
	}
	
}