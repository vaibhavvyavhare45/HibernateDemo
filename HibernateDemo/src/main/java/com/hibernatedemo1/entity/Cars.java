package com.hibernatedemo1.entity;

public class Cars {
	private int carId;
	private String carName;
	private double carPrice;
	private String carColor;
	
	public Cars(String carName, double carPrice, String carColor) {
		super();
		this.carName = carName;
		this.carPrice = carPrice;
		this.carColor = carColor;
	}
	
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	

}
