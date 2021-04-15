//framework for unused class SystemAdministrator:


//--------------------------------------------------------

package com.extra;
import java.util.*;

import com.User;

public class SystemAdministrator extends User {

	Collection<AdministratorQuery> administratorQueries;

	public SystemAdministrator(String nname, String uuserName, String eemail) {
		super(nname, uuserName, eemail);
	}

	public boolean startWorking(AdministratorQuery administratorQuery) {
		return administratorQuery.startProgress(this);
	}

}