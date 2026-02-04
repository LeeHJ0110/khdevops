package main;

public class Beverage {
	
	public Beverage() {}
	public Beverage(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return "name=" + name +", price="+price;
	}
	
}
