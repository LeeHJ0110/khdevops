package condition;

import java.util.Scanner;

public class Study01 {

	public static void main(String[] args) {
		
//		지하철 요금 판단
//		7세 미만 공짜
//		8~19 1000
//		20~65 2000
//		65 초과 공짜
		
		System.out.print("나이를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int price;
		
		
		if(x < 7) {
			price = 0;
		}
		else if(x < 20) {
			price = 1000;
		}
		else if(x <= 65) {
			price = 2000;
		}else {
			price = 0;
		}
		
		
		System.out.print("당신의 지하철 요금은 " + price + "원 입니다");

	}

}
