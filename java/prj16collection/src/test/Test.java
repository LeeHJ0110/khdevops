package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class Test {
	
	public void test01() {
		ArrayList x = new ArrayList();
		x.add("사과");
		x.add("딸기");
		x.add(1124);
		x.add(3.14);
		x.add(false);
		
		x.remove(1);
		
		System.out.println(x.size());
		
	}
	public void test02() {
		HashSet x = new HashSet();
		x.add("사과");
		x.add("사과");
		x.add("딸기");
		x.add("딸기");
		x.add("딸기");
		x.add("딸기");
		x.add(1124);
		x.add(3.14);
		
		
		System.out.println(x.size());
	}
	public void test03() {
		HashMap x = new HashMap();
		x.put(3,false);
		x.put("일","사과");
		x.put("삼","자두");
		x.put("이",32);
		x.put(1,"철수");
		
		System.out.println(x);
	}
	public void test04() {
		Stack x = new Stack();
		x.add("사과");
		x.add("딸기");
		x.add("배");
		
		System.out.println(x.pop());
		System.out.println(x.pop());
		System.out.println(x.pop());
	}
	public void test05() {
		LinkedList x = new LinkedList();
		
		x.offer("새우깡");
		x.offer("감자깡");
		x.offer("고구마깡");
		
		
		System.out.println(x.poll());
		System.out.println(x.poll());
		System.out.println(x.poll());
	}
	
}
