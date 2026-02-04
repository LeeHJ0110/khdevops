package homework;

import java.util.Scanner;

public class Main {
	
	public static int totalPrice;
	public static Restaurant[] rest = new Restaurant[3];
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Food[] menu = new Food[3];
		menu[0] = new Food("페퍼로니 피자", 11000, 2);
		menu[1] = new Food("고구마 피자", 10000, 2);
		menu[2] = new Food("불고기 피자", 14000, 2);
		
		Restaurant pizza = new Restaurant("피자리아", "강남역", menu);
		rest[0] = pizza;
		
		
		menu = new Food[3];
		menu[0] = new Food("빅맥", 4500, 2);
		menu[1] = new Food("와퍼", 5500, 2);
		menu[2] = new Food("싸이버거", 6500, 2);
		
		Restaurant burger = new Restaurant("버거리아", "역삼역", menu);
		rest[1] = burger;
		
		menu = new Food[3];
		menu[0] = new Food("양념치킨", 20000, 2);
		menu[1] = new Food("후라이드치킨", 20000, 2);
		menu[2] = new Food("반반치킨", 21000, 2);
		
		Restaurant chicken = new Restaurant("치킨나라", "역삼역", menu);
		rest[2] = chicken;
		
		while(true) {
			
			System.out.println("배달시킬 음식점을 고르세요");
			for(int i = 0 ; i < rest.length ; i ++) {
				System.out.println(i+1 +"번 : " + rest[i].getName() + ", 위치 : " + rest[i].getAdr());
			}
			System.out.println("0: 그만 고르기");
			int select = sc.nextInt();
			if(select <= 0) {
				System.out.println("배달금액 총 "+totalPrice+"원 입니다.");
				break;
			}else if(select <= rest.length) {
				rest[select - 1].showMenu();
			}else {
				System.out.println("올바른 번호가 아닙니다");
			}
			
			System.out.println(totalPrice);
			System.out.println();
		
		}
		
		
	}


}
