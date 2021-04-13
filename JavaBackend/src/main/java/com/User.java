package com;

/**
 * @author Shannon
 */
public abstract class User {
	
	private String id;
	private String userName;
	private String email;
	private String name;

	public User(String nname, String uuserName, String eemail, String iid) {
		this.id = iid;
		this.name = nname;
		this.userName = uuserName;
		this.email = eemail;
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
	public String getid() {
		return this.id;
	}

	//---------------------------------------------------------------------------------------------
	//firebase stuff
	public User() {
		//empty constructor for firestore database
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}


}