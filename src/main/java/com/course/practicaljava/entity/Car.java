package com.course.practicaljava.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

//@Document(indexName = "practical-java")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Car {

	private List<String> additionalFeatures;

	private boolean available;

	private String brand;
	
	private String color;
	
	private LocalDate firstReleaseDate;
	
	private int price;
	
	private String type;
	
	public Car() {

	}

	public Car(String brand, String color, String type, boolean available, int price, LocalDate firstReleaseDate) {
		super();
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.available = available;
		this.price = price;
		this.firstReleaseDate = firstReleaseDate;
	}

	public List<String> getAdditionalFeatures() {
		return additionalFeatures;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public LocalDate getFirstReleaseDate() {
		return firstReleaseDate;
	}

	public int getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAdditionalFeatures(List<String> additionalFeatures) {
		this.additionalFeatures = additionalFeatures;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFirstReleaseDate(LocalDate firstReleaseDate) {
		this.firstReleaseDate = firstReleaseDate;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", type=" + type + ", available=" + available + ", price="
				+ price + ", firstReleaseDate=" + firstReleaseDate + "]";
	}

}
