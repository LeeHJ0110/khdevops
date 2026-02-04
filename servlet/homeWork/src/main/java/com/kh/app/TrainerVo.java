package com.kh.app;

public class TrainerVo {
	
	private String no;
	private String id;
	private String pw;
	private String name;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TrainerVo(String no, String id, String pw, String name) {
		super();
		this.no = no;
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	@Override
	public String toString() {
		return "TrainerVo [no=" + no + ", id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	public TrainerVo() {
		super();
		// TODO Auto-generated constructor stub
	}
}
