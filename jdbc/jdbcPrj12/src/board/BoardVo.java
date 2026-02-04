package board;

public class BoardVo {
	

	public BoardVo(String no, String title, String content, String writerNo, String writerNick, String hit,
			String createdAt, String updateAt, String delYn) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writerNo = writerNo;
		this.writerNick = writerNick;
		this.hit = hit;
		this.createdAt = createdAt;
		this.updateAt = updateAt;
		this.delYn = delYn;
	}
	public BoardVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String no;
	private String title;
	private String content;
	private String writerNo;
	private String writerNick;
	private String hit;
	private String createdAt;
	private String updateAt;
	private String delYn;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriterNo() {
		return writerNo;
	}
	public void setWriterNo(String writerNo) {
		this.writerNo = writerNo;
	}
	public String getWriterNick() {
		return writerNick;
	}
	public void setWriterNick(String writerNick) {
		this.writerNick = writerNick;
	}
	public String getHit() {
		return hit;
	}
	public void setHit(String hit) {
		this.hit = hit;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	@Override
	public String toString() {
		return "BoardVo [no=" + no + ", title=" + title + ", content=" + content + ", writerNo=" + writerNo
				+ ", writerNick=" + writerNick + ", hit=" + hit + ", createdAt=" + createdAt + ", updateAt=" + updateAt
				+ ", delYn=" + delYn + "]";
	}

	
}
