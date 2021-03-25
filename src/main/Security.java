package main;
public class Security {

	private String userName;
	private String password;
	private Boolean unlocked;
	private String email;

	public Security(String password, String userName, String email) {
		this.password = password;
		this.userName = userName;
		this.unlocked = false;
		this.email = email;
	}

	public void login(String userNameORemail, String password) {
		if((this.userName.equals(userNameORemail) || this.email.equals(userNameORemail)) && this.password.equals(password)){this.unlocked = true;}
	}

	public void changeUserName(String newUserName) {
		this.userName = newUserName;
	}

	public void changePassword(String newPassword) {
		this.password= newPassword;
	}

	public String getUserName() {
		return this.userName;
	}

	public void forgotPasswordSendCode(String email) {
		// TODO - implement Security.forgotPasswordSendCode
		throw new UnsupportedOperationException();
	}

	public boolean forgotPasswordCheckCode(String code) {
		// TODO - implement Security.forgotPasswordCheckCode
		throw new UnsupportedOperationException();
	}

	public boolean isUnlocked() {
		return this.unlocked;
	}

	public void logout() {
		this.unlocked = false;
	}

}