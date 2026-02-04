package test;

import java.util.Arrays;

public class KHArray {
	
	public KHArray() {
		arr = new int[3];
		
	}

	private int[] arr;
	private int idx = 0;
	
	//추가 삭제 메서드
	public void add(int data) {
		if(arr.length == idx) {
			int[] newArr = new int[arr.length *2];
			for(int i = 0 ; i < arr.length;i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
		}
		arr[idx++] = data;
	}

	public int get(int idx) {
		return arr[idx];
	}
	
	public void delete(int n) {
		for(int i = n ; i < idx ; i++) {
			arr[i] = arr[i + 1];
		} 
		idx--;
		arr[idx] = 0;
	}

	public void printArray() {
		for(int i = 0 ; i < idx-1 ; i++) {
			System.out.println(arr[i]);
		}
	}

	
}
