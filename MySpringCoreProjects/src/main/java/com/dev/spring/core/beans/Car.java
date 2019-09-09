package com.dev.spring.core.beans;

public class Car {
	private String model;
	private String brand;
	private Engine engine;
	
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
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", brand=" + brand + ", engine=" + engine + "]";
	}
}