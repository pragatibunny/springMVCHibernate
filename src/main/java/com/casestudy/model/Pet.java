package com.casestudy.model;

import org.springframework.stereotype.Component;

@Component
public class Pet {
	private long petid;
	private String petName;
	private Integer petAge;
	private String petPlace;
	private User user;
	public long getPetid() {
		return petid;
	}
	public void setPetid(long petid) {
		this.petid = petid;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public Integer getPetAge() {
		return petAge;
	}
	public void setPetAge(Integer petAge) {
		this.petAge = petAge;
	}
	public String getPetPlace() {
		return petPlace;
	}
	public void setPetPlace(String petPlace) {
		this.petPlace = petPlace;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "Pet [petid=" + petid + ", petName=" + petName + ", petAge=" + petAge + ", petPlace=" + petPlace
				+ ", user=" + user + "]";
	}
}
