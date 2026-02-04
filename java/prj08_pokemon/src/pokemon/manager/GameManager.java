package pokemon.manager;


import main.Main;
import pokemon.mob.Pokemon;

public class GameManager {
   
   //멤버 변수
   Pokemon[] pokemonArr = new Pokemon[3];
   int num;
   
   //포켓몬들 생성
   public void generatePokemon() {
      pokemonArr[0] = new Pokemon();
      pokemonArr[1] = new Pokemon();
      pokemonArr[2] = new Pokemon();
      
      pokemonArr[0].setName("피카츄");
      pokemonArr[0].setHp(100);
      pokemonArr[0].setAtk(10);
      
      pokemonArr[1].setName("파이리");
      pokemonArr[1].setHp(90);
      pokemonArr[1].setAtk(11);
      
      pokemonArr[2].setName("꼬부기");
      pokemonArr[2].setHp(110);
      pokemonArr[2].setAtk(9);
      
   }
   
   //포켓몬들 정보 출력
   public void printPokemon() {
	  generatePokemon();
      System.out.println("----- 포켓몬 목록 -----");
      System.out.println("번호 / 이름 / 체력 / 공격력");
      System.out.println("1 / " + pokemonArr[0].getName() + " / " + pokemonArr[0].getHp() + " / " + pokemonArr[0].getAtk());
      System.out.println("2 / " + pokemonArr[1].getName() + " / " + pokemonArr[1].getHp() + " / " + pokemonArr[1].getAtk());
      System.out.println("3 / " + pokemonArr[2].getName() + " / " + pokemonArr[2].getHp() + " / " + pokemonArr[2].getAtk());
   }
   public void selectUserPokemon() {
	   System.out.print("원하는 포켓몬 번호 : ");
	   num = Main.sc.nextInt();
	   Main.userPokemon = pokemonArr[num - 1];
   }
   
   public void selectComPokemon() {
	   Main.comPokemon = pokemonArr[num%3];
   }

}





