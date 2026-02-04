package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("====제어문 연습(가위 바위 보)====");
		Scanner sc = new Scanner(System.in);
		
		
		// 1 가위 2 바위 3 보
		System.out.println("1.가위 2.바위 3.보");
		int user = sc.nextInt();
		// 컴퓨터 값 랜덤
		int com = 1;
		
		String result;
		if((user + 1) % 3 == com % 3) {
			result = "유저 패배";
		}else if((user + 2) % 3 == com % 3) {
			result = "유저 승리";
		}else {
			result = "무승부";
		}
		System.out.println(result);
		

		
		// 결과 출력
		
		
	}

}
