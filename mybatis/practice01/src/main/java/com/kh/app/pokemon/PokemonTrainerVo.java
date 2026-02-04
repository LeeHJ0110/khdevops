package com.kh.app.pokemon;

public class PokemonTrainerVo {
	private String no;
	private String name;
	private String type;
	private String ability;
	private String trainer;
	public PokemonTrainerVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PokemonTrainerVo(String no, String name, String type, String ability, String trainer) {
		super();
		this.no = no;
		this.name = name;
		this.type = type;
		this.ability = ability;
		this.trainer = trainer;
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
	public String getAbility() {
		return ability;
	}
	public void setAbility(String ability) {
		this.ability = ability;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	@Override
	public String toString() {
		return "PokemonTrainerVo [no=" + no + ", name=" + name + ", type=" + type + ", ability=" + ability
				+ ", trainer=" + trainer + "]";
	}

}
