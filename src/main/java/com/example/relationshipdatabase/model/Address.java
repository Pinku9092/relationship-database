package com.example.relationshipdatabase.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private int houseNo;
	private int pinCode;
	private String City;
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", pinCode=" + pinCode + ", City=" + City + "]";
	}
	
	

}
