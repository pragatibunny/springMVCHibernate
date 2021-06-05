package com.casestudy.model;

//import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity 
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userid;
	private String userName;
	private String userPassword;
	private String confirmPassword;
	//private Set<String> pets;
	public User() {
		super();
		
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	//public Set<String> getPets() {
	//	return pets;
	//}
	//public void setPets(Set<String> pets) {
		//this.pets = pets;
	//}
	//@Override
	//public String toString() {
		//return "User [userid=" + userid + ", userName=" + userName + ", userPassword=" + userPassword
			//	+ ", confirmPassword=" + confirmPassword + ", pets=" + pets + "]";
	//}
}
