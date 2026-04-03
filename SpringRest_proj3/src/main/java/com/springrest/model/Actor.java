package com.springrest.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Actor {

	private Integer id;
	private String name;
	private String address;
	private Float fees;
	
	private float remunatation;
	private String[] favColor;
	private List<String> friend;
	private Set<Long> phone;
	private Map<String, Object> idDetails;
	private Vehicle vehicle;
	
	public float getRemunatation() {
		return remunatation;
	}
	public void setRemunatation(float remunatation) {
		this.remunatation = remunatation;
	}
	public String[] getFavColor() {
		return favColor;
	}
	public void setFavColor(String[] favColor) {
		this.favColor = favColor;
	}
	public List<String> getFriend() {
		return friend;
	}
	public void setFriend(List<String> friend) {
		this.friend = friend;
	}
	public Set<Long> getPhone() {
		return phone;
	}
	public void setPhone(Set<Long> phone) {
		this.phone = phone;
	}
	public Map<String, Object> getIdDetails() {
		return idDetails;
	}
	public void setIdDetails(Map<String, Object> idDetails) {
		this.idDetails = idDetails;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Float getFees() {
		return fees;
	}
	public void setFees(Float fees) {
		this.fees = fees;
	}
	public Actor(Integer id, String name, String address, Float fees) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.fees = fees;
	}
	
	
}
