package com.nishant;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "University")
public class University {
    @Id
	private String id;
	private String name;
	//@Indexed (direction = IndexDirection.ASCENDING)
	//private int Ranking;
	private Address address;
	private List<Review> reviews;
	
	
	public University(String name, Address address, List<Review> reviews) {
		this.name = name;
		this.address = address;
		this.reviews = reviews;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	

	
	
}
