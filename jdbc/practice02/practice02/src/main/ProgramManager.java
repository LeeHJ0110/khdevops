package main;

import member.MemberManager;
import util.UtilManager;
import video.VideoManager;

public class ProgramManager {

	private MemberManager mm = new MemberManager();
	private VideoManager vm = new VideoManager();

	public void process() throws Exception {

		while (true) {
			System.out.println("----영상 관리----");
			System.out.println("0. 프로그램 종료");
			System.out.println("1. 계정 확인");
			System.out.println("2. 영상 확인");

			System.out.print("번호 입력 : ");
			int num = UtilManager.scanNum();

			switch (num) {
			case 0:
				System.out.println("프로그램 종료");
				return;
			case 1:
				mm.process();
				break;
			case 2:
				vm.process();
				break;
			default:
				System.out.println("잘못된 접근 입니다.");
			}

		}
	}

}
