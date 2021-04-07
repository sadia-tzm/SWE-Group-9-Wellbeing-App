package com.extra;
import java.util.*;

import com.User;

public class SystemAdministrator extends User {

	Collection<AdministratorQuery> administratorQueries;

	public SystemAdministrator(String nname, String ppassword, String uuserName, String eemail) {
		super(nname, ppassword, uuserName, eemail);
	}

	public boolean startWorking(AdministratorQuery administratorQuery) {
		return administratorQuery.startProgress(this);
	}

}