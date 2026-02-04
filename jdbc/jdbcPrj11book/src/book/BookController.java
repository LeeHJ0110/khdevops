package book;

import java.util.List;
import java.util.Scanner;

public class BookController {
	
	private final Scanner sc = new Scanner(System.in);
	private final BookService bs = new BookService();
	
	public void process() {
		
		while(true) {
			try {
				printMenu();
				
				int num = scanNumber();
				
				callFunction(num);
			}catch(IllegalStateException e) {
				System.out.println("예외 발생");
				e.printStackTrace();
				return;
			}catch(Exception e) {
				System.out.println("에러 발생");
				e.printStackTrace();
			}

		}
		
	}

	private void callFunction(int num) throws Exception {
		switch(num) {
		case 0 :throw new IllegalStateException();
		case 1: insert(); break;
		case 2: edit(); break;
		case 3: delete(); break;
		case 4: selectList(); break;
		case 5: searchByTitle(); break;
		default: System.out.println("잘못된 번호 입니다");
		}
	}

	private void searchByTitle() throws Exception {
		System.out.print("title: ");
		String title = sc.nextLine();
		
		List<BookVo> voList = bs.searchByTitle(title);
		
		for(BookVo vo : voList) {
			System.out.println(vo);
		}
	}

	private void selectList() throws Exception {
		List<BookVo> voList = bs.selectList();
		
		for(BookVo vo : voList) {
			System.out.println(vo);
		}
	}

	private void delete() throws Exception {
		System.out.print("no: ");
		String no = sc.nextLine();
		
		int result = bs.delete(no);
		
		if(result == 1) {
			System.out.println("도서 삭제 성공");
			return;
		}
		System.out.println("도서 삭제 실패");
	}

	private void edit() throws Exception {
		System.out.print("no: ");
		String no = sc.nextLine();
		System.out.print("price: ");
		String price = sc.nextLine();
		
		BookVo vo = new BookVo();
		vo.setPrice(price);
		vo.setNo(no);
		
		int result = bs.edit(vo);
		
		if(result == 1) {
			System.out.println("도서 수정 성공");
			return;
		}
		System.out.println("도서 수정 실패");
	}

	private void insert() throws Exception {
		
		System.out.print("title: ");
		String title = sc.nextLine();
		System.out.print("price: ");
		String price = sc.nextLine();
		
		BookVo vo = new BookVo();
		vo.setTitle(title);
		vo.setPrice(price);
		
		int result = bs.insert(vo);
		
		if(result == 1) {
			System.out.println("도서 등록 성공");
			return;
		}
		System.out.println("도서 등록 실패");
		
	}

	private int scanNumber() {
		System.out.print("메뉴 번호: ");
		return Integer.parseInt(sc.nextLine());
	}

	private void printMenu() {
		System.out.println("----Menu----");
		System.out.println("0. 프로그램 종료");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 수정(가격)");
		System.out.println("3. 도서 삭제");
		System.out.println("4. 도서 목록조회");
		System.out.println("5. 도서 검색(제목)");
	}
	
}
