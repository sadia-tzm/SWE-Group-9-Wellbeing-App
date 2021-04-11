package com;

/**
 * @author Shannon
 */
public class User {
	
	private long id;
	private String name;
	Security security;

	public User(String nname, String password, String userName, String email) {
		this.id = 10;
		this.name = nname;
		this.security = new Security(password, userName, email);
	}

	public User() {
		//empty user constructor for firestore database
	}

	/**
	 * getter for user name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * This is a setter for the user name
	 * @param newName The name the user changes to. 
	 */
	public void changeName(String newName) {
		this.name = newName;

	}

	/**
	 * getter for user ID
	 */
	public long getid() {
		return this.id;
	}

	/**
	 * getter for user name
	 */
	public Security getSecurity() {
		return this.security;
	}

}