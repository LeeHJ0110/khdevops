package codeup;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = (int)(Math.random() * 9);
		int num2 = (int)(Math.random() * 9);
		int num3 = (int)(Math.random() * 9);
		
		boolean flag = true;
		while(flag) {
				
			int input1 = sc.nextInt();
			int input2 = sc.nextInt();
			int input3 = sc.nextInt();
			
			int Cnt = 0;
			if(input1 == num1) {
				Cnt++;
			}
			if(input2 == num2) {
				Cnt++;
			}
			if(input3 == num3) {
				Cnt++;
			}
			if(Cnt == 3)break;
			System.out.println(Cnt + "개 맞음");
			System.out.println();
		}
		System.out.println("정답!");
		
	}
}
