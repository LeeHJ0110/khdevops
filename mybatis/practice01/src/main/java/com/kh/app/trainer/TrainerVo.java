package com.kh.app.trainer;

public class TrainerVo {
	private String no;
	private String id;
	private String pw;
	private String nick;
	public TrainerVo() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public TrainerVo(String no, String id, String pw, String nick) {
		super();
		this.no = no;
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public TrainerVo(String nick) {
		super();
		this.nick = nick;
	}
	@Override
	public String toString() {
		return "TrainerVo [no=" + no + ", id=" + id + ", pw=" + pw + ", nick=" + nick + "]";
	}
	
	
}
