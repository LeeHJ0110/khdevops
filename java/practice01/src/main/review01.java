package main;

import java.util.Scanner;

public class review01 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("1.가위 2.바위 3.보");
		int user = sc.nextInt();
		
		int com = (int)(Math.random() * 3 + 1);
		
		String userHand = "비었음";
		switch(user) {
		case 1: userHand = "가위";break;
		case 2: userHand = "바위";break;
		case 3: userHand = "보";break;
		default : System.out.println("잘못된 숫자입니다");
		}
		
		String comHand = "비었음";
		switch(com) {
		case 1: comHand = "가위";break;
		case 2: comHand = "바위";break;
		case 3: comHand = "보";break;
		default : System.out.println("잘못된 숫자입니다");
		}
		
		//유저와 컴퓨터의 손 공개
		System.out.println("당신 : " + userHand);
		System.out.println("상대 : " + comHand);

		if ((user + 1) % 3 == com % 3) {
			System.out.println("유저 패배");
		} else if ((user + 2) % 3 == com % 3) {
			System.out.println("유저 승리");
		} else {
			System.out.println("무승부");
		}


	}

}
