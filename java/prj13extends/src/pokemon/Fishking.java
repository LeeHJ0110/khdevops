package pokemon;

public class Fishking extends Pokemon{

	public Fishking() {
		super("잉어킹", 80, 20);
	}
	
	@Override
	public void skill() {
		System.out.println("뛰어오르기");
	}
	
	
}
