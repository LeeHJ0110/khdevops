package board;

import static main.DispatcherController.SC;

import java.util.List;

import main.Main;
import member.MemberController;

public class BoardController {

	private final BoardService service = new BoardService();
	private final MemberController mc = new MemberController();
	
	public void process() throws Exception {
		System.out.println("----Board----");
		System.out.println("0. 이전으로");
		System.out.println("1. 게시글 작성");
		System.out.println("2. 제목 수정");
		System.out.println("3. 내용 수정");
		System.out.println("4. 제목 및 내용 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("6. 목록조회");
		System.out.println("7. 상세조회");
		System.out.println("8. 제목 검색");
		System.out.println("9. 내용 검색");
		System.out.println("10. 작성자 검색");
		System.out.print("메뉴 번호: ");
		
		String num = SC.nextLine();
		
		switch(num) {
		case "0": return;
		case "1": insert(); break;
		case "2": updateTitle(); break;
		case "3": updateContentByNo(); break;
		case "4": updateBoardByNo(); break;
		case "5": deleteBoardByNo(); break;
		case "6": selectAll(); break;
		case "7": selectOneByNo(); break;
		case "8": searchByTitle(); break;
		case "9": searchByContent(); break;
		case "10": searchByWriter(); break;
		}
	}
	
	public void insert() throws Exception {
		mc.checkLogin();
		System.out.println("----게시글 등록----");
		
		System.out.print("게시글 제목: ");
		String title = SC.nextLine();
		System.out.print("게시글 내용: ");
		String content = SC.nextLine();
		String writerNo = Main.loginMemberVo.getNo();
		
		BoardVo vo = new BoardVo();
		vo.setTitle(title);
		vo.setContent(content);
		vo.setWriterNo(writerNo);
		
		int result = service.insert(vo);
		
		if(result == 1) {
			System.out.println("게시글 작성 성공");
			return;
		}
		System.out.println("게시글 작성 실패");
		
	}
	public void updateTitle() throws Exception {
		mc.checkLogin();
		System.out.println("----게시글 제목 수정----");
		
		System.out.print("수정할 게시글 번호: ");
		String no = SC.nextLine();
		System.out.print("수정할 게시글 제목: ");
		String title = SC.nextLine();
		String writerNo = Main.loginMemberVo.getNo();
		BoardVo vo = new BoardVo();
		vo.setNo(no);
		vo.setTitle(title);
		vo.setWriterNo(writerNo);
		
		int result = service.updateTitleByNo(vo);
		
		if(result == 1) {
			System.out.println("게시글 수정 성공");
			return;
		}
		System.out.println("게시글 수정 실패");
		
	}
	public void updateContentByNo() throws Exception {
		mc.checkLogin();
		System.out.println("----게시글 제목 수정----");
		
		System.out.print("수정할 게시글 번호: ");
		String no = SC.nextLine();
		System.out.print("수정할 게시글 내용: ");
		String content = SC.nextLine();
		String writerNo = Main.loginMemberVo.getNo();
		BoardVo vo = new BoardVo();
		vo.setNo(no);
		vo.setContent(content);
		vo.setWriterNo(writerNo);
		
		int result = service.updateContentByNo(vo);
		
		if(result == 1) {
			System.out.println("게시글 수정 성공");
			return;
		}
		System.out.println("게시글 수정 실패");
	}
	public void updateBoardByNo() throws Exception {
		mc.checkLogin();
		System.out.println("----게시글 내용 수정----");
		
		System.out.print("수정할 게시글 번호: ");
		String no = SC.nextLine();
		System.out.print("수정할 게시글 제목: ");
		String title = SC.nextLine();
		System.out.print("수정할 게시글 내용: ");
		String content = SC.nextLine();
		String writerNo = Main.loginMemberVo.getNo();
		BoardVo vo = new BoardVo();
		vo.setNo(no);
		vo.setContent(content);
		vo.setTitle(title);
		vo.setWriterNo(writerNo);
		
		int result = service.updateBoardByNo(vo);
		
		if(result == 1) {
			System.out.println("게시글 수정 성공");
			return;
		}
		System.out.println("게시글 수정 실패");
	}
	public void deleteBoardByNo() throws Exception {
		mc.checkLogin();
		System.out.println("----게시글 삭제----");
		
		System.out.print("삭제 게시글 번호: ");
		String no = SC.nextLine();
		String writerNo = Main.loginMemberVo.getNo();
		BoardVo vo = new BoardVo();
		
		vo.setNo(no);
		vo.setWriterNo(writerNo);
		
		int result = service.deleteBoardByNo(vo);
		
		if(result == 1) {
			System.out.println("게시글 삭제 성공");
			return;
		}
		System.out.println("게시글 삭제 실패");
	}
	public void selectAll() throws Exception {
		System.out.println("----게시글 목록 조회----");
		List<BoardVo> voList = service.selectAll();
		
		System.out.println("번호 | 제목 | 작성자 | 조회수");
		for(BoardVo vo : voList) {
			System.out.print(vo.getNo());
			System.out.print(" | ");
			System.out.print(vo.getTitle());
			System.out.print(" | ");
			System.out.print(vo.getWriterNick());
			System.out.print(" | ");
			System.out.print(vo.getHit());
			System.out.println();
		}
	}
	public void selectOneByNo() throws Exception {
		System.out.println("----게시글 상세조회----");
		System.out.print("조회할 게시글 번호: ");
		String no = SC.nextLine();
		BoardVo vo = service.selectOneByNo(no);
		
		if(vo != null) {
			System.out.println("번호: " + vo.getNo());
			System.out.println("제목: " + vo.getTitle());
			System.out.println("내용: " + vo.getContent());
			System.out.println("작성자: " + vo.getWriterNick());
			System.out.println("조회수: " + vo.getHit());
			System.out.println("작성일시: " + vo.getCreatedAt());
			System.out.println("수정일시: " + vo.getUpdateAt());
			return;
		}
		System.out.println("게시글 조회 실패");
	}
	public void searchByTitle() {
		
	}
	public void searchByContent() {}
	public void searchByWriter() throws Exception {
		System.out.println("---- 검색 (작성자)----");
		
		System.out.println("작성자: ");
		String writerNick = SC.nextLine();
		
		List<BoardVo> voList = service.searchByWriterNick(writerNick);
		System.out.println("번호 | 제목 | 작성자 | 조회수");
		for(BoardVo vo : voList) {
			System.out.print(vo.getNo());
			System.out.print(" | ");
			System.out.print(vo.getTitle());
			System.out.print(" | ");
			System.out.print(vo.getWriterNick());
			System.out.print(" | ");
			System.out.print(vo.getHit());
			System.out.println();
		}
	}
	
	
	
	
	
}
