package codeup;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		boolean isPass = true;
		int firstCrash = 0;
		
		if(c <= 170) {
			isPass = false;
			firstCrash = c;
		}
		if(b <= 170) {
			isPass = false;
			firstCrash = b;
		}
		if(a <= 170) {
			isPass = false;
			firstCrash = a;
		}
		
		if(isPass) {
			System.out.println("PASS");
		}else {
			System.out.println("CRASH " + firstCrash);
		}
	}

}
