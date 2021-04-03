package main;
import java.util.*;

public class SystemAdministrator extends User {

	Collection<AdminstratorQuery> administratorQueries;

	public SystemAdministrator(String nname, String ppassword, String uuserName, String eemail) {
		super(nname, ppassword, uuserName, eemail);
	}

	public boolean startWorking(AdministratorQuery administratorQuery) {
		administratorQuery.progress = "Started to work on Query";
	}

}