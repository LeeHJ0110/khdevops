package pokemon;

public abstract class Pokemon {
	
	public Pokemon(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}

	public String name;
	public int hp;
	public int atk;
	
	public abstract void skill();
	
	
}
