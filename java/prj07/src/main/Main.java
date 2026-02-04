package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====ARRAY====");
		
		int[] a = new int[5];
		
		for(int i = 0; i < 5 ; i++) {
			a[i] = (i+1)*10;
		}
		
		
		for(int i = 0 ; i < 5;i++) {
			System.out.println(a[i]);
		}

	}

}
