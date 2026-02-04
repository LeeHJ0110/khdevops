package com.kh.app.board;

public class BoardVo {
	private String no;
	private String title;
	private String content;
	private String hit;
	private String createdAt;
	private String updatedAt;
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
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	public BoardVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardVo(String no, String title, String content, String hit, String createdAt, String updatedAt,
			String delYn) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.hit = hit;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.delYn = delYn;
	}
	@Override
	public String toString() {
		return "BoardVo [no=" + no + ", title=" + title + ", content=" + content + ", hit=" + hit + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + ", delYn=" + delYn + "]";
	}
}
