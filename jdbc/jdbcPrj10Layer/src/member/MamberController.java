package member;

import java.util.Scanner;

public class MamberController {
	
	private final Scanner sc = new Scanner(System.in);
	private final MemberService ms = new MemberService();
	public void process() {
		
		while(true) {
			System.out.println("0. 프로그램 종료");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			
			System.out.println("메뉴 번호: ");
			String num = sc.nextLine();
			
			try {
				switch(num) {
				case "0" : System.out.println("프로그램을 종료합니다"); return;
				case "1" : join(); break;
				case "2" : login(); break;
				default : System.out.println("잘못된 번호 입니다");
				}
			}catch(Exception e) {
				System.out.println("Member Error");
				e.printStackTrace();//
			}
		}
		
	}
	
	private void join() throws Exception{
		System.out.println("----회원가입----");
		System.out.print("id : ");
		String id = sc.nextLine();
		System.out.print("pw : ");
		String pw = sc.nextLine();
		System.out.print("nick : ");
		String nick = sc.nextLine();
		MemberVo vo = new MemberVo();
		vo.setId(id);
		vo.setPw(pw);
		vo.setNick(nick);
		
		int result =ms.join(vo);
		
		if(result == 1) {
			System.out.println("회원가입 성공");
			return;
		}
		System.out.println("회원가입 실패");
		
	}
	private void login() {
		System.out.println("----로그인----");
	}
	
}
