package com.kh.app;

public class PokemonVo {
	
	private String no;
	private String name;
	private String type;
	private String level;
	private String owner;
	@Override
	public String toString() {
		return "PokemonVo [no=" + no + ", name=" + name + ", type=" + type + ", level=" + level + ", owner=" + owner
				+ "]";
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public PokemonVo(String no, String name, String type, String level, String owner) {
		super();
		this.no = no;
		this.name = name;
		this.type = type;
		this.level = level;
		this.owner = owner;
	}
	public PokemonVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
