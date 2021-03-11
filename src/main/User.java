package main;
import java.util.*;
import java.time.*; 

public abstract class User {

	Collection<Query> queries;
	Security security;
	private String ID;
	private String name;

	/**
	 * Constructor for the user class
	 * @param nname users name
	 * @param password password login details
	 * @param userName username
	 * @param email email address
	 */
	public User(String nname, String password, String userName, String email) {
		this.name = nname;
		this.security = new Security(password, userName, email);
	}

	/**
	 * creates new query object and adds the query to the system.
	 * @param query the text that contains the details of the query, entered by the user.
	 */
	public void reportBug(String query) {
		LocalDateTime date = LocalDateTime.now();
		String title = "Query from "+getID()+ ": "+date.toString();
		Query q = new Query(query, title ,LocalDateTime.now());
		queries.add(q);
	}

	public String getName() {
		return this.name;
	}

	/**
	 * This is a setter for the user name
	 * @param newName The name the user changes to. 
	 */
	public boolean changeName(String newName) {
		this.name = newName;
	}

	public String getID() {
		return this.ID;
	}

	public String getRole() {
		// TODO - implement User.getRole
		throw new UnsupportedOperationException();
	}

	public Security getSecurity() {
		return this.security;
	}

}