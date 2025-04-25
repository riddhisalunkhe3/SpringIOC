package com.springIOC.task1;

public class Recharge {
	private String name;
	private String price;
	
	public Recharge() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Recharge(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Recharge [name=" + name + ", price=" + price + "]";
	}
	
}
