package main.extra;
import java.util.*;

import main.User;

public class CustomerSupport extends User {

	private String password;
	private String userName;
	private String email;
	Collection<SupportQuery> supportQueries;


	public CustomerSupport(String nname, String ppassword, String uuserName, String eemail) {
		super(nname, ppassword, uuserName, eemail);
		this.password = ppassword;
		this.userName = uuserName;
		this.email = eemail;


	}
	
	// TODO - rest of CustomerSupport

	// public List<SupportQuery> checkQueries() {
	// }

}