package models;

public class UserModel {

	 private String emailAddress;
	 private String password;
	 private String repeatedPassword;


	 // Getter Methods 

	 public UserModel(String emailAddress, String password, String repeatedPassword) {
		super();
		this.emailAddress = emailAddress;
		this.password = password;
		this.repeatedPassword = repeatedPassword;
	}

	public String getEmailAddress() {
	  return emailAddress;
	 }

	 public String getPassword() {
	  return password;
	 }

	 public String getRepeatedPassword() {
	  return repeatedPassword;
	 }

	 // Setter Methods 

	 public void setEmailAddress(String emailAddress) {
	  this.emailAddress = emailAddress;
	 }

	 public void setPassword(String password) {
	  this.password = password;
	 }

	 public void setRepeatedPassword(String repeatedPassword) {
	  this.repeatedPassword = repeatedPassword;
	 }
	}