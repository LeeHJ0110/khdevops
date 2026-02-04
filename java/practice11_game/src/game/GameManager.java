package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameManager {
	
	private List<GameVo> arr = new ArrayList<>();
	
	private Scanner sc = new Scanner(System.in);
	
	public void startProgram() {
		arr.add(new GameVo("리그오브레전드",0));
		arr.add(new GameVo("마인크래프트",20000));
		arr.add(new GameVo("오버워치",15000));
		arr.add(new GameVo("카트라이더",0));
		arr.add(new GameVo("서든어택",0));
		
		while(true) {
			//메뉴
			printMenu();
			//번호입력
			System.out.println("번호를 입력해주세요");
			int num = inputNum();
			if(num == 0) {
				break;
			}
			//해당 매소드 실행
			executeFunction(num);
		}
	}
	
	private void printMenu() {
		System.out.println("\n----Menu----");
		System.out.println("0. 프로그램 종료");
		System.out.println("1. 게임 등록");
		System.out.println("2. 게임 목록 조회");
		System.out.println("3. 게임 상세 조회");
		System.out.println("4. 게임 수정");
		System.out.println("5. 게임 삭제");
	}
	
	private int inputNum() {
		return Integer.parseInt(sc.nextLine());
	}
	
	private void executeFunction(int num) {
		switch(num) {
		case 1: insert(); break;
		case 2: selectList(); break;
		case 3: selectOne(); break;
		case 4: update(); break;
		case 5: delete(); break;
		default: System.out.println("잘못된 번호 입니다");
		}
	}
	
	private void insert() {
		System.out.println("\n----게임 등록----");

		System.out.print("게임 이름 : ");
		String name = sc.nextLine();
		System.out.print("게임 가격 : ");
		int price = inputNum();
		
		arr.add(new GameVo(name,price));
		
	}
	private void selectList() {
		System.out.println("\n----게임 목록 조회----");
		
		System.out.println("총 게임 개수: " + arr.size());
		
		System.out.println("게임 이름 / 게임 가격");
		arr.forEach(vo -> System.out.println(vo.getName() + "\t / " + vo.getPrice() + "원"));
	}
	private void selectOne() {
		System.out.println("\n----게임 상세 조회----");
		
		printNumber();
		
		System.out.print("번호를 입력해주세요: ");
		int num = inputNum();
		if(!checkList(num)) {
			return;
		}
		
		printVo(num);
	}
	private void update() {
		System.out.println("\n----게임 수정----");
		
		printNumber();
		
		System.out.print("번호를 입력해주세요: ");
		int num = inputNum();
		if(!checkList(num)) {
			return;
		}
		
		System.out.print("새 게임 이름 : ");
		arr.get(num).setName(sc.nextLine());
		
		System.out.print("새 게임 가격 : ");
		arr.get(num).setPrice(inputNum());
		
		printVo(num);
	}
	private void delete() {
		System.out.println("\n----게임 삭제----");
		
		printNumber();
		
		System.out.println("번호를 입력해주세요: ");
		int num = inputNum();
		if(!checkList(num)) {
			return;
		}
		arr.remove(num);
		System.out.println("게임 삭제 완료");
	}
	
	private boolean checkList(int num) {
		if(num < 0 || num >= arr.size()) {
			System.out.println("해당 번호의 게임은 없습니다");
			return false;
		}
		return true;
	}
	
	private void printNumber() {
		System.out.println("0번 부터 " + (arr.size() - 1) + "번 까지 있습니다");
	}

	private void printVo(int num) {
		System.out.println(arr.get(num).getName() + "\t / " + arr.get(num).getPrice() + "원");
	}
	
}
