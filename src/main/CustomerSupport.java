package main;
import java.util.*;

public class CustomerSupport extends User {

	private String password;
	private String userName;
	private String email;
	Collection<SupportQuery> supportQueries;

	/**
	 * 
	 * @param nname
	 * @param password
	 * @param userName
	 * @param email
	 */
	public CustomerSupport(String nname, String ppassword, String uuserName, String eemail) {
		super(nname);
		this.password = ppassword;
		this.userName = uuserName;
		this.email = eemail;


	}

	public List<SupportQuery> checkQueries() {
		// TODO - implement CustomerSupport.checkQueries
		throw new UnsupportedOperationException();
	}

}