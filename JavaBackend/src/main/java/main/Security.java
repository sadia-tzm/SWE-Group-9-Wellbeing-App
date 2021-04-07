package main;
public class Security {

	private String userName;
	private String password;
	private Boolean unlocked;
	private String email;
	private int randomCode;

	public Security(String password, String userName, String email) {
		this.password = password;
		this.userName = userName;
		this.unlocked = true;
		this.email = email;
		this.randomCode = this.generateForgotPasswordCode();
	}

	public void login(String userNameORemail, String password) {
		if((this.userName.equals(userNameORemail) || this.email.equals(userNameORemail)) && this.password.equals(password)) this.unlocked = true;
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

	public int generateForgotPasswordCode() {
		Integer min = 100000, max = 999999, codeToSend = min;
		codeToSend = (int)(Math.random() * (max - min + 1) + min);
		this.randomCode = codeToSend;
		return codeToSend;
	}

	public boolean forgotPasswordCheckCode(int code) {
		if (randomCode == code) return true;
		return false;
	}

	public boolean isUnlocked() {
		return this.unlocked;
	}

	public void logout() {
		this.unlocked = false;
	}

}