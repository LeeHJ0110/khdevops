package game;

public class GameVo {
	
	
	public GameVo(String name, int price) {
		super();
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
	
	@Override
	public String toString() {
		return "GameVo [name=" + name + ", price=" + price + "]";
	}
	
}
