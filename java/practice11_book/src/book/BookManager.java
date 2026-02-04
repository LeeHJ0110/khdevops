package book;

import java.util.Scanner;

public class BookManager {

	private int cnt = 0;
	
	private Scanner sc = new Scanner(System.in);
	
	private BookVo[] arr = new BookVo[100];
	
	public void startProgram() {
		while(true) {
			printMenu();
			int num = scanNumber();
			if(num == 0) {break;};
			executeFuntion(num);
		}
	}
	
	private void printMenu() {
		System.out.println("\n----Menu----");
		System.out.println("0. 프로그램 종료");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 목록조회");
		System.out.println("3. 도서 상세조회");
		System.out.println("4. 도서 수정");
		System.out.println("5. 도서 삭제");
	}
	
	private int scanNumber() {
		System.out.print("메뉴 번호 입력 : ");
		return Integer.parseInt(sc.nextLine());
	}
	
	private void executeFuntion(int num) {
		switch(num) {
		case 1: insert(); break;
		case 2: selectList(); break;
		case 3: selectOne(); break;
		case 4: update(); break;
		case 5: delete(); break;
		default: System.out.println("잘못된 번호 입니다.");
		}
	}
	
	public void insert() {
		System.out.println("\n----도서등록----");
		System.out.println("도서 제목 : ");
		String title = sc.nextLine();
		System.out.println("도서 가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		BookVo vo = new BookVo(title, price);
		arr[cnt] = vo;
		cnt++;
		System.out.println("저장 완료");
	}
	
	public void selectOne() {
		System.out.println("\n----도서 상세 조회----");
		
		System.out.println("조회할 도서 번호");
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.print("도서 제목 : " + arr[num].getTitle());
		System.out.print("도서 가격 : " + arr[num].getPrice());
	}
	
	public void selectList() {
		
		System.out.println("\n----도서 목록 조회----");
		
		System.out.println("도서제목 / 도서가격");
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == null) {
				continue;
			}
			System.out.print(arr[i].getTitle());
			System.out.print(" / ");
			System.out.print(arr[i].getPrice());
			System.out.println();
		}
	}
	
	public void update() {
		System.out.println("\n----도서 수정----");
		
		System.out.print("수정할 도서 번호 : ");
		int num = Integer.parseInt(sc.nextLine());

		BookVo x = arr[num];
		if(x == null) {
			System.out.println("해당 번호의 도서는 존재하지 않습니다.");
			return;
		}
		
		System.out.print("수정할 도서 제목 : ");
		String title = sc.nextLine();
		
		System.out.print("수정할 도서 가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		x.setTitle(title);
		x.setPrice(price);
		
		System.out.println("도서 수정 완료");
		
	}
	
	public void delete() {
		System.out.println("\n----도서 삭제----");
		System.out.print("삭제할 도서 번호 : ");
		int num = Integer.parseInt(sc.nextLine());
		arr[num] = null;
		System.out.println("도서 삭제 완료");
	}
		
	
	
}
