package book;

public class BookVo {
	
	
	
	public BookVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public BookVo(String no, String title, String price, String createdAt) {
		super();
		this.no = no;
		this.title = title;
		this.price = price;
		this.createdAt = createdAt;
	}


	private String no;
	private String title;
	private String price;
	private String createdAt;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "BookVo [no=" + no + ", title=" + title + ", price=" + price + ", createdAt=" + createdAt + "]";
	}

	
}
