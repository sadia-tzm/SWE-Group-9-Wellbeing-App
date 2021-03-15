package main;
import java.util.*;

public class SystemAdministrator extends User {

	private String password;
	private String userName;
	private String email;
	Collection<AdminstratorQuery> administratorQueries;

	/**
	 * 
	 * @param nname
	 * @param password
	 * @param userName
	 * @param email
	 */
	public SystemAdministrator(String nname, String ppassword, String uuserName, String eemail) {
		super(nname);
		this.password = ppassword;
		this.userName = uuserName;
		this.email = eemail;
	}

	/**
	 * 
	 * @param administratorQuery
	 */
	public boolean startWorking(AdministratorQuery administratorQuery) {
		// TODO - implement SystemAdministrator.startWorking
		throw new UnsupportedOperationException();
	}

}