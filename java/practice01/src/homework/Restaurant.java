package homework;

public class Restaurant {
	
	public Restaurant(String name, String adr, Food[] menu) {
		this.name = name;
		this.adr = adr;
		this.menu = menu;
	}
	
	private String name;
	private String adr;
	Food[] menu;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	
	public void showMenu() {
		System.out.println("메뉴를 골라주세요");
		for(int i = 0 ; i < menu.length ; i++) {
			System.out.println(i+1 + "번 메뉴명: " + menu[i].getName() + ", 가격:" + menu[i].getPrice() + "원, " + menu[i].getPerPerson() + "인분");
		}
		int select = Main.sc.nextInt();
		if(select <= 0) {
			return;
		}else if(select <= menu.length) {
			Main.totalPrice += menu[select - 1].getPrice();
		}else {
			System.out.println("올바른 번호가 아닙니다");
		}
	}
	
}
