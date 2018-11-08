package com.sophos.challenge.demoaut.models;

public class MailInformation {

	private String address;
	private String city;
	private String province;
	private String postalCode;
	private String country;
	
	public MailInformation() {
		
	}

	public MailInformation(String address, String city, String province, String country) {
		super();
		this.address = address;
		this.city = city;
		this.province = province;
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	@Override
	public String toString() {
		return "MailInformation [address=" + address + ", city=" + city + ", province=" + province + ", country="
				+ country + "]";
	}
}
