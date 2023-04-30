package com.spring.LifeCycle;

public class Samosha {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Price");
		this.price = price;
	}

	public Samosha() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosha [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside Init method");
	}
	
	public void destroy() {
		System.out.println("Inside Destroy Method");
	}
		
}
