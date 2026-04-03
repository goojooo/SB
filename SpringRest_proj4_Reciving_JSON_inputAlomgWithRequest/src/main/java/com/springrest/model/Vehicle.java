package com.springrest.model;

public class Vehicle {

	@Override
	public String toString() {
		return "Vehicle [regNo=" + regNo + ", model=" + model + ", make=" + make + ", price=" + price + "]";
	}
	private String regNo;
	private String model;
	private String make;
	private Double price;
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Vehicle(String regNo, String model, String make, Double price) {
		super();
		this.regNo = regNo;
		this.model = model;
		this.make = make;
		this.price = price;
	}
	
	
}
