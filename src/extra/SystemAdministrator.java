package main;
import java.util.*;

public class SystemAdministrator extends User {

	Collection<AdminstratorQuery> administratorQueries;

	/**
	 * 
	 * @param nname
	 * @param password
	 * @param userName
	 * @param email
	 */
	public SystemAdministrator(String nname, String ppassword, String uuserName, String eemail) {
		super(nname, ppassword, uuserName, eemail);
	}

	/**
	 * 
	 * @param administratorQuery
	 */
	public boolean startWorking(AdministratorQuery administratorQuery) {
		administratorQuery.progress = "Started to work on Query";
	}

}