package org.dipanjan.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	private long id;
	private String fname;
	private String lname;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public User(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	public User() {
	}
	@Override
	public String toString() {
		return String.format("User [id=%s, fname=%s, lname=%s]", id, fname, lname);
	}
	
	
	
	
	
	

}
