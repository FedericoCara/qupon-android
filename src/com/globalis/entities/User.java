package com.globalis.entities;

import java.util.Hashtable;
import com.google.gson.annotations.SerializedName;

public class User {	
	@SerializedName("user[email]")
	private String email;
	@SerializedName("user[name]")
	private String firstName;
	@SerializedName("user[last_name]")
	private String lastName;
	@SerializedName("user[zip_code]")
	private String zipCode;
	@SerializedName("user[phone_number]")
	private String phoneNumber;
	@SerializedName("user[sex]")
	private String gender;
	@SerializedName("user[password]")
	private String password;
	@SerializedName("user[password_confirmation]")
	private String passwordConfirmation;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}	
	
	public User(String email, String firstName, String lastName, String zipCode,
			String phoneNumber, String gender, String password, String passwordConfirmation) {
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.password = password;
		this.passwordConfirmation = passwordConfirmation;
	}

	public Hashtable<String, String> getHashtable() {
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("user[email]", email);
		hashtable.put("user[name]", firstName);
		hashtable.put("user[last_name]", lastName);
		hashtable.put("user[zip_code]", zipCode);
		hashtable.put("user[phone_number]", phoneNumber);
		hashtable.put("user[sex]", gender);
		hashtable.put("user[password]", password);
		hashtable.put("user[password_confirmation]", passwordConfirmation);
		return hashtable;
	}
}