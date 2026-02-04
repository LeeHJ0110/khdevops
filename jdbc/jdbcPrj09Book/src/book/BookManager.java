package book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
	
	private final Scanner sc = new Scanner(System.in);
	private final BookDao dao = new BookDao();
	
	public void process() throws Exception {
		while(true) {
			
			System.out.println("0. 프로그램 종료");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 가격 수정");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 목록조회(최신순)");
			System.out.println("5. 도서 목록조회(오래된순)");
			System.out.println("6. 도서 검색(제목)");
			System.out.println("7. 도서 검색(가격)");
			System.out.println("8. 도서 상세조회");
			
			System.out.print("원하는 메뉴 번호: ");
			String num = sc.nextLine();
			
			switch(num) {
			case "0" : System.out.println("프로그램 종료"); return;
			case "1" : insert(); break;
			case "2" : update(); break;
			case "3" : delete(); break;
			case "4" : selectListDesc(); break;
			case "5" : selectListAsc(); break;
			case "6" : searchByTitle(); break;
			case "7" : searchByPrice(); break;
			case "8" : selectOneByNo(); break;
			default : System.out.println("잘못된 번호 입니다");
			}
		}
		
	}
	
	public void insert() throws Exception {
		
		System.out.print("등록할 도서 제목: ");
		String title = sc.nextLine();
		System.out.print("등록할 도서 가격: ");
		String price = sc.nextLine();
		BookVo vo = new BookVo();
		vo.setTitle(title);
		vo.setPrice(price);
		
		if(dao.insert(vo) == 1) {
			System.out.println("도서 등록 성공");
			return;
		}
		System.out.println("도서 등록 실패");
		
	}
	public void update() throws Exception  {
		
		System.out.print("수정할 도서 번호: ");
		String no = sc.nextLine();
		System.out.print("수정할 도서 가격: ");
		String price = sc.nextLine();
		BookVo vo = new BookVo();
		vo.setNo(no);
		vo.setPrice(price);
		
		if(dao.update(vo) == 1) {
			System.out.println("도서 등록 성공");
			return;
		}
		System.out.println("도서 등록 실패");
	}
	
	public void delete() throws Exception  {
		
		System.out.print("삭제할 도서 번호: ");
		String no = sc.nextLine();
		
		if(dao.delete(no) == 1) {
			System.out.println("도서 삭제 성공");
			return;
		}
		System.out.println("도서 삭제 실패");
	}
	
	public void selectListDesc() throws Exception  {
		
		ArrayList<BookVo> voList = dao.selectListDesc();

		
		for(BookVo vo : voList) {
			System.out.print(vo.getNo());
			System.out.print(" | ");
			System.out.print(vo.getTitle());
			System.out.print(" | ");
			System.out.print(vo.getPrice());
			System.out.print(" | ");
			System.out.print(vo.getCreatedAt());
			System.out.println();
		}
	}
	public void selectListAsc() throws Exception  {
		ArrayList<BookVo> voList = dao.selectListAsc();

		
		for(BookVo vo : voList) {
			System.out.print(vo.getNo());
			System.out.print(" | ");
			System.out.print(vo.getTitle());
			System.out.print(" | ");
			System.out.print(vo.getPrice());
			System.out.print(" | ");
			System.out.print(vo.getCreatedAt());
			System.out.println();
		}
	}
	
	public void searchByTitle() throws Exception  {
		System.out.print("조회할 도서 제목: ");
		String title = sc.nextLine();
		
		ArrayList<BookVo> voList = dao.searchByTitle(title);
		
		for(BookVo vo : voList) {
			System.out.print(vo.getNo());
			System.out.print(" | ");
			System.out.print(vo.getTitle());
			System.out.print(" | ");
			System.out.print(vo.getPrice());
			System.out.print(" | ");
			System.out.print(vo.getCreatedAt());
			System.out.println();
		}
		
	}
	public void searchByPrice() throws Exception  {
		System.out.print("조회할 도서 가격: ");
		String price = sc.nextLine();
		
		ArrayList<BookVo> voList = dao.searchByPrice(price);
		
		for(BookVo vo : voList) {
			System.out.print(vo.getNo());
			System.out.print(" | ");
			System.out.print(vo.getTitle());
			System.out.print(" | ");
			System.out.print(vo.getPrice());
			System.out.print(" | ");
			System.out.print(vo.getCreatedAt());
			System.out.println();
		}
	}
	public void selectOneByNo() throws Exception  {
		System.out.print("조회할 도서 번호: ");
		String no = sc.nextLine();
		
		BookVo vo = dao.selectOneByNo(no);
		
		if(vo != null) {
			System.out.print(vo.getNo());
			System.out.print(" | ");
			System.out.print(vo.getTitle());
			System.out.print(" | ");
			System.out.print(vo.getPrice());
			System.out.print(" | ");
			System.out.print(vo.getCreatedAt());
			System.out.println();
			return;
		}
		System.out.println("도서 조회 실패");
	}
}
