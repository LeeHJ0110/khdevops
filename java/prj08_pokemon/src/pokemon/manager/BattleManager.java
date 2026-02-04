package pokemon.manager;

import main.Main;
import pokemon.mob.Pokemon;

public class BattleManager {
	public void battleStart(){
		Pokemon user = Main.userPokemon;
		Pokemon com = Main.comPokemon;
		
		while(true) {
			
			user.attack();
			com.setHp(com.getHp() - user.getAtk());
			System.out.println(com.getName() + "의 체력 :" + com.getHp());
			
			if(com.getHp() <= 0) {
				System.out.println(user.getName() + " 승!");
				break;
			}
			
			
			com.attack();
			user.setHp(user.getHp() - com.getAtk());
			System.out.println(user.getName() + "의 체력 :" + user.getHp());
			
			if(user.getHp() <= 0) {
				System.out.println(user.getName() + " 패배");
				break;
			}
			System.out.println();
		
		}
	}
}
