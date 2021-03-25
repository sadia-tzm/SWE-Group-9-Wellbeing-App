package main;
import java.util.*;
public class Security {

	private String userName;
	private String password;
	private Boolean unlocked;
	private String email;
	private ArrayList<Integer> codes;

	public Security(String password, String userName, String email) {
		this.password = password;
		this.userName = userName;
		this.unlocked = false;
		this.email = email;
		this.codes = new ArrayList<Integer>();
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

	public int generateForgotPasswordCode() {
		int min = 100000, max = 999999, codeToSend = min;
		while(!(codes.contains(codeToSend))){codeToSend = (int)(Math.random() * (max - min + 1) + min);}
		codes.add(codeToSend);
		return codeToSend;
	}

	public boolean forgotPasswordCheckCode(int code) {
		if (codes.get(codes.size()-1) == code){ return true;}
		return false;
	}

	public boolean isUnlocked() {
		return this.unlocked;
	}

	public void logout() {
		this.unlocked = false;
	}

}