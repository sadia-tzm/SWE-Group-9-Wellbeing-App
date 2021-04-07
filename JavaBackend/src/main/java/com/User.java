package com;

/**
 * @author Shannon
 */
public abstract class User {

	Security security;
	private String ID;
	private String name;

	public User(String nname, String password, String userName, String email) {
		this.name = nname;
		this.security = new Security(password, userName, email);
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
	public String getID() {
		return this.ID;
	}

	/**
	 * getter for user name
	 */
	public Security getSecurity() {
		return this.security;
	}

}