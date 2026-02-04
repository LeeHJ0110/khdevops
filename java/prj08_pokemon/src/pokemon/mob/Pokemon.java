package pokemon.mob;

public class Pokemon {
   
   //멤버 변수
   private String name;
   private int hp;
   private int atk;
   
   //멤버 메서드
   public void attack() {
      System.out.println(name + "의 몸통박치기 !");
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      if( name.length() > 0 ) {
         this.name = name;
      }else {
         System.out.println("name 은 1글자 이상 이어야합니다.");
      }
   }

   public int getHp() {
      return hp;
   }

   public void setHp(int hp) {
     this.hp = hp;
   }

   public int getAtk() {
      return atk;
   }

   public void setAtk(int atk) {
      if(atk > 0) {
         this.atk = atk;
      }else {
         System.out.println("atk 는 0 이하일 수 없습니다.");
      }
   }
   
   
   
   

}//class
