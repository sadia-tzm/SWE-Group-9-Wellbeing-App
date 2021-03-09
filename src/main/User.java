import java.util.*;

public abstract class User {

	Collection<Query> queries;
	Security security;
	private String ID;
	private String name;

	/**
	 * 
	 * @param nname
	 * @param password
	 * @param userName
	 * @param email
	 */
	public boolean User(String nname, String password, String userName, String email) {
		// TODO - implement User.User
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param query
	 */
	public void reportBug(String query) {
		// TODO - implement User.reportBug
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param newName
	 */
	public boolean changeName(String newName) {
		// TODO - implement User.changeName
		throw new UnsupportedOperationException();
	}

	public String getID() {
		// TODO - implement User.getID
		throw new UnsupportedOperationException();
	}

	public String getRole() {
		// TODO - implement User.getRole
		throw new UnsupportedOperationException();
	}

	public Security getSecurity() {
		return this.security;
	}

}