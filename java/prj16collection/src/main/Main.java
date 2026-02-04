package main;

import test.Test;

public class Main {

	public static void main(String[] args) {
		System.out.println("==== collection ====");
		/*
		 * 자료구조
		 * [List] : ArrayList, LinkedList
		 * - 순서 유지
		 * - 인덱스로 접근 가능
		 * - 중복 허용
		 * 
		 * [Set] : HastSet, TreeSet, LinkedHashSet
		 * - 중복 제거
		 * - 값만 저장
		 * 
		 * [Map] : HashMap, TreeMap, LinkedHashMap
		 * - 엔트리(entry) 형태(Key:Value) 저장
		 * - Key 중복 불가능
		 * - Value 중복 가능
		 * - Key 로 접근
		 * 
		 * [Stack]: Stack, Vector, ArrayDeque
		 * - LIFO(Last In First Out) 구조
		 * 
		 * [Queue]: LinkedList, ArrayDeque, PriorityQueue
		 * - FIFO(First In First Out) 구조
		 */
		
		Test t = new Test();
		
//		t.test01();
//		t.test02();
//		t.test03();
//		t.test04();
		t.test05();
		
		
	}

}
