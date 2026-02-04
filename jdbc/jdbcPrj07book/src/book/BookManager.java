package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class BookManager {
	
	public static Connection conn;
	public static Scanner sc;
	private final BookInsertController bic;
	private final BookUpdateController buc;
	private final BookDeleteController bdc;
	private final BookSelectListController bslc;
	private final BookSelectOneController bsoc;
	
	public BookManager() throws Exception {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@//127.0.0.1:1521/xe";
		String user = "C##KH";
		String pw = "1234";
		
		Class.forName(driver);
		conn = DriverManager.getConnection(url, user, pw);
		sc = new Scanner(System.in);
		
		bic = new BookInsertController();
		buc = new BookUpdateController();
		bdc = new BookDeleteController();
		bslc = new BookSelectListController();
		bsoc = new BookSelectOneController();
	}
	
	public void process() throws Exception {
		while(true) {
			
			// 메뉴 보여주기
			printMenu();
			
			// 메뉴 번호 입력받기
			int num = scanNum();
			
			//프로그램 종료 체크
			if(num == 0) {
				System.out.println("프로그램을 종료합니다");
				return;
			}
			
			// 기능 수행
			callFunction(num);
			
		}
	
	}
	
	private void callFunction(int num) throws Exception {
		switch(num) {
		case 1 : bic.service(); break;
		case 2 : buc.service(); break;
		case 3 : bdc.service(); break;
		case 4 : bslc.service(); break;
		case 5 : bsoc.service(); break;
		default: System.out.println("잘못된 번호 입니다");
		}
	}
	
	private int scanNum() {
		System.out.print("번호 입력: ");
		return Integer.parseInt(sc.nextLine());
	}
	
	private void printMenu() {
		System.out.println("----Menu----");
		System.out.println("0. 프로그램 종료");
		System.out.println("1. 도서등록");
		System.out.println("2. 도서수정");
		System.out.println("3. 도서삭제");
		System.out.println("4. 도서목록조회");
		System.out.println("5. 도서상세조회");
	}
	
}
