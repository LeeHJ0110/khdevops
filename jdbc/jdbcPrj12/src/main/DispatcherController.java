package main;

import java.util.Scanner;

import board.BoardController;
import member.MemberController;

public class DispatcherController {
	
	public final static Scanner SC = new Scanner(System.in);
	private final MemberController mc = new MemberController();
	private final BoardController bc = new BoardController();
	
	public void process() {
		while(true) {
			try {
				
				System.out.println("0. EXIT");
				System.out.println("1. Member");
				System.out.println("2. Board");
				System.out.print("메뉴 번호: ");
				String num = SC.nextLine();
				
				switch(num) {
				case "0": System.out.println("프로그램 종료"); return;
				case "1": mc.process(); break;
				case "2": bc.process(); break;
				default : System.out.println("잘못된 번호 입니다");
				}
			}catch(Exception e) {
				System.out.println("에러 발생");
				e.printStackTrace();
			}
		}
	}
	
	
}
