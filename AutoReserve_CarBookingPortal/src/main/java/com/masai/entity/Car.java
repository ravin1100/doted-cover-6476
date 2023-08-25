package com.masai.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Car_Id")
	private int carId;
	
	@Column(name = "model", length = 50, nullable = false)
	private String model;
	
	@Column(name = "brand", length = 50, nullable = false)
	private String brand;
	
	@Column(name = "price", length = 50, nullable = false)
	private String price;
	
	@Column(name = "availability", length = 50, nullable = false)
	private boolean availability;
	
	@Column(name = "Registration_Number", length = 50, nullable = false)
	private String regNumber;

	public Car() {
		super();
	}

	public Car(String model, String brand, String price, boolean availability, String regNumber) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.availability = availability;
		this.regNumber = regNumber;
	}

	public int getCarId() {
		return carId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", model=" + model + ", brand=" + brand + ", price=" + price + ", availability="
				+ availability + ", regNumber=" + regNumber + "]";
	}
		
}
