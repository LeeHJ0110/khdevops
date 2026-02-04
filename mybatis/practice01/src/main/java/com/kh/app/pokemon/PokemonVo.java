package com.kh.app.pokemon;

public class PokemonVo {
	private String no;
	private String name;
	private String type;
	private String ability;
	private String trainerNo;
	private String createdAt;
	private String updatedAt;
	private String delYn;
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
	public String getTrainerNo() {
		return trainerNo;
	}
	public void setTrainerNo(String trainerNo) {
		this.trainerNo = trainerNo;
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
	public PokemonVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PokemonVo(String no, String name, String type, String ability, String trainerNo, String createdAt,
			String updatedAt, String delYn) {
		super();
		this.no = no;
		this.name = name;
		this.type = type;
		this.ability = ability;
		this.trainerNo = trainerNo;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.delYn = delYn;
	}
	@Override
	public String toString() {
		return "PokemonVo [no=" + no + ", name=" + name + ", type=" + type + ", ability=" + ability + ", trainerNo="
				+ trainerNo + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", delYn=" + delYn + "]";
	}
}
