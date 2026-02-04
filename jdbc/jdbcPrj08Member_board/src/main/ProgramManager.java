package main;

import member.MemberManager;
import util.KhUtil;

public class ProgramManager {
	
	private MemberManager mm = new MemberManager();
	
	public void precess() throws Exception {
		
		while(true) {
			System.out.println("0. 프로그램 종료");
			System.out.println("1. 맴버 관련 기능");
			System.out.println("2. 게시글 관련 기능");
			System.out.println("번호: ");
			
			int num = KhUtil.scanNum();

			switch(num) {
			case 0: System.out.println("프로그램 종료"); return;
			case 1: mm.process(); break;
	//		case 2: bm.process(); break;
			default : System.out.println("잘못된 번호입니다");
			}
		}
	
	}
}
