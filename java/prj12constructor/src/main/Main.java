package main;

public class Main {

	
	
	public static void main(String[] args) {
		
		System.out.println("===생성자===");
		/*
		 * 생성자 == 생성자 메서드 : 객체 생성
		 * new 생성자();
		 * 
		 * [문법]
		 * 접근제한자 클래스명(매개변수) {실행내용}
		 * 
		 */
		
		Person x = new Person("홍길동", 20, "의적");
		Person y = new Person("김철수", 20);
		
		Person p = new Person();

		
		
	}

}
