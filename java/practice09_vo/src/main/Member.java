package main;

public class Member {
	
	//constructor
	public Member() {
		
	}
	
	// all args constructor
	public Member(String id, String pwd, String nick) {
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
	}
	
	// field
	private String id;
	private String pwd;
	private String nick;
	
	// getter / setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	

	//printInfo
	public void printInfo() {
		System.out.println("id: " + this.id);
		System.out.println("pwd: " + this.pwd);
		System.out.println("nick: " + this.nick);
	}
	
}
