package com.kh.app;

public class MemberVo {
	
	
	public MemberVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberVo(String userId, String userPw, String userNick) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userNick = userNick;
	}
	private String userId;
	private String userPw;
	private String userNick;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserNick() {
		return userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}
	@Override
	public String toString() {
		return "MemberVo [userId=" + userId + ", userPw=" + userPw + ", userNick=" + userNick + "]";
	}
	
	
}
