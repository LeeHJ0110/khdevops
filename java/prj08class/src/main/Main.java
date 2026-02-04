package main;

public class Main {

	public static void main(String[] args) {
		/*
		 * Class: 데이터 + 기능
		 * - 클래스를 이용해 객체를 만들 수 있다
		 * 
		 */
		
		Pokemon x = new Pokemon();
		x.name = "피카츄";
		x.level = 20;
		x.type = "전기";
		
		System.out.println(x.name);
		System.out.println(x.level);
		System.out.println(x.type);
		
	}

}
