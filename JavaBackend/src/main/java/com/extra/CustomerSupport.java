//framework for unused class CustomerSupport:


//--------------------------------------------------------


package com.extra;
import java.util.*;

import com.User;

public class CustomerSupport extends User {

	private String userName;
	private String email;
	Collection<SupportQuery> supportQueries;


	public CustomerSupport(String nname, String uuserName, String eemail) {
		super(nname, uuserName, eemail);
		this.userName = uuserName;
		this.email = eemail;
	}

}