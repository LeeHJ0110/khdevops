package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("== Value Object ==");
		
		Student s = new Student("홍길동", 18, 86, 90, 75, 1.6, 75.3,'m',false);
		
		System.out.println(s.toString());
		
	}

}
