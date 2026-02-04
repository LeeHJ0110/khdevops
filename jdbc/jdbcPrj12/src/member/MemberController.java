package member;

import static main.DispatcherController.SC;

import main.Main;

public class MemberController {
	
	private final MemberService ms = new MemberService();
	
	public void process() throws Exception {
		System.out.println("----Member----");
		System.out.println("0. 이전으로");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 로그아웃");
		System.out.println("4. 비밀번호 변경");
		System.out.println("5. 닉네임 변경");
		System.out.println("6. 회원탈퇴");
		System.out.println("7. 내 정보 조회");
		System.out.print("메뉴 번호: ");
		
		String num = SC.nextLine();
		
		switch(num) {
		case "0": return;
		case "1": join(); break;
		case "2": login(); break;
		case "3": logout(); break;
		case "4": editPw(); break;
		case "5": editNick(); break;
		case "6": quit(); break;
		case "7": selectOne(); break;
		}
	}
	
	public void join() throws Exception {
		System.out.println("----회원가입----");
		System.out.print("아이디: ");
		String id = SC.nextLine();
		System.out.print("비밀번호: ");
		String pw = SC.nextLine();
		System.out.print("비밀번호 확인: ");
		String pw2 = SC.nextLine();
		System.out.print("닉네임: ");
		String nick = SC.nextLine();
		
		MemberVo vo = new MemberVo();
		vo.setId(id);
		vo.setPw(pw);
		vo.setNick(nick);
		
		int result = ms.join(vo, pw2);
		
		if(result == 1) {
			System.out.println("회원가입 성공");
			return;
		}
		System.out.println("회원가입 실패");
		
	}
	public void login() throws Exception {
		System.out.println("----로그인----");
		System.out.print("아이디: ");
		String id = SC.nextLine();
		System.out.print("비밀번호: ");
		String pw = SC.nextLine();
		
		MemberVo  vo = new MemberVo();
		vo.setId(id);
		vo.setPw(pw);
		
		MemberVo dbVo = ms.login(vo);
		
		if(dbVo == null) {
			System.out.println("로그인 실패");
			return;
		}
		System.out.println("로그인 성공");
		Main.loginMemberVo = dbVo;
		
	}
	public void logout() {
		System.out.println("----로그아웃----");
		Main.loginMemberVo = null;
		System.out.println("로그아웃 성공");
	}
	public void editPw() throws Exception {
		checkLogin();
		
		System.out.println("----비밀번호 수정----");
		
		System.out.print("기존 비밀번호: ");
		String pw = SC.nextLine().trim();
		System.out.print("변경할 비밀번호: ");
		String newPw = SC.nextLine().trim();
		System.out.print("비밀번호 확인: ");
		String newPw2 = SC.nextLine().trim();
		
		int result = ms.editPw(pw, newPw, newPw2);
		
		if(result == 1) {
			System.out.println("비밀번호 수정 성공");
			logout();
			return;
		}
		System.out.println("비밀번호 수정 실패");
		
		
	}
	public void editNick() throws Exception {
		checkLogin();
		
		System.out.print("비밀번호: ");
		String pw = SC.nextLine().trim();
		System.out.print("변경할 닉네임: ");
		String nick = SC.nextLine().trim();
		MemberVo vo = new MemberVo();
		vo.setNick(nick);
		vo.setPw(pw);
		
		int result = ms.editNick(vo);
		
		if(result == 1) {
			System.out.println("닉네임 수정 성공");
			Main.loginMemberVo.setNick(nick);
			return;
		}
		System.out.println("닉네임 수정 실패");
	}
	public void quit() throws Exception {
		checkLogin();
		int result = ms.quit();
		if(result == 1) {
			logout();
			System.out.println("탈퇴 성공");
			return;
		}
		System.out.println("탈퇴 실패");
	}
	public void selectOne() {
		checkLogin();
		System.out.println("----마이페이지----");
		System.out.println(Main.loginMemberVo);
	}
	
	public void checkLogin() {
		if(Main.loginMemberVo == null) {

		}
	}
}
