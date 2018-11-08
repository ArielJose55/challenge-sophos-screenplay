package com.sophos.challenge.demoaut.models;

public class User {
	
	private String name;
	private String lastName;
	private String phone;
	private String email;
	private MailInformation mailInformation;
	private UserInformation userInformation;
	
	public User() {
		
	}

	public User(String name, String lastName, String phone, String email, MailInformation mailInformation,
			UserInformation userInformation) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.mailInformation = mailInformation;
		this.userInformation = userInformation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public MailInformation getMailInformation() {
		return mailInformation;
	}

	public void setMailInformation(MailInformation mailInformation) {
		this.mailInformation = mailInformation;
	}

	public UserInformation getUserInformation() {
		return userInformation;
	}

	public void setUserInformation(UserInformation userInformation) {
		this.userInformation = userInformation;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", lastName=" + lastName + ", phone=" + phone + ", email=" + email + "]";
	}
}
