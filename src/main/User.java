package main;

public abstract class User {

	Security security;
	private String ID;
	private String name;

	public User(String name, String password, String userName, String email) {
		this.name = name;
		this.security = new Security(password, userName, email);
	}

	public String getName() {
		return this.name;
	}

	public void changeName(String newName) {
		this.name = newName;
	}

	public String getID() {
		return this.ID;
	}

	public Security getSecurity() {
		return this.security;
	}

}