package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===학생 성적 관리===");
		
		System.out.print("학생수: ");
		int studentCnt = sc.nextInt();
		
		byte[] studentArr = new byte[studentCnt];
		
		//입력
		for(int i = 0 ; i < studentArr.length ; i++) {
			System.out.print(i+1+"번 학생 성적:");
			studentArr[i] = sc.nextByte();
		}
		System.out.println();
		
		int sum = 0;
		for(int i = 0 ; i < studentArr.length ; i++) {
			sum += studentArr[i];
		}
		
		System.out.println("0. 프로그램 종료");
		System.out.println("1. 전체 학생 성적 출력");
		System.out.println("2. 총합 출력");
		System.out.println("3. 평균 출력");
		System.out.println("4. 학생 한명 성적 출력");
		
		while(true) {
			int num = sc.nextInt();
			if(num == 0) {
				break;
			}else if(num ==1) {
				//모든학생 출력
				for(int i = 0 ; i < studentArr.length ; i++) {
					System.out.println(i+1+"번 학생 성적: "+studentArr[i]);
				}
			}else if(num==2) {
				System.out.println("학생 성적 합계 : " + sum);
			}else if(num==3) {
				System.out.println("학생 성적 평균 : " + (double)sum / studentCnt);
			}else if(num==4) {
				//학생 한명 성적 출력
				int stdNum = sc.nextInt();
				System.out.println(studentArr[stdNum-1]);
			}else {
				
				System.out.println("잘못된 번호 입니다");
			}
		}
		
		
		
	}

}
