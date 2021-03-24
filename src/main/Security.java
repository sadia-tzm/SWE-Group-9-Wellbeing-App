package main;
public class Security {

	private String userName;
	private String password;
	private Boolean unlocked;
	private String email;

	/**
	 * 
	 * @param ppassword
	 * @param uuserName
	 * @param eemail
	 */
	public boolean Security(String ppassword, String uuserName, String eemail) {
		// TODO - implement Security.Security
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param userNameOReemail
	 * @param ppassword
	 */
	public boolean login(String userNameOReemail, String ppassword) {
		// TODO - implement Security.login
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param String
	 */
	public boolean changeUserName(String newUserName ) {
		// TODO - implement Security.changeUserName
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param String
	 */
	public boolean changePassword(String newPassword ) {
		// TODO - implement Security.changePassword
		throw new UnsupportedOperationException();
	}

	public boolean getUserName() {
		// TODO - implement Security.getUserName
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param eemail
	 */
	public void forgotPasswordSendCode(String eemail) {
		// TODO - implement Security.forgotPasswordSendCode
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param code
	 */
	public boolean forgotPasswordCheckCode(String code) {
		// TODO - implement Security.forgotPasswordCheckCode
		throw new UnsupportedOperationException();
	}

	public boolean isUnlocked() {
		// TODO - implement Security.isUnlocked
		throw new UnsupportedOperationException();
	}

	public boolean logout() {
		// TODO - implement Security.logout
		throw new UnsupportedOperationException();
	}

}