package book;

public class BookVo {
	
	
	public BookVo() {
	}
	
	public BookVo(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	private String title;
	private int price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "BookVo [title=" + title + ", price=" + price + "]";
	}
	
}
