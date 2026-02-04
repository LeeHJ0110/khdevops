package main;

public class Computer {
	
	public Computer(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	
	private String brand;
	private int price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return "brand=" + brand + ", price=" + price;
	}
}
