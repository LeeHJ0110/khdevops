package main;

public class khThreadPlus extends Thread {
	
	@Override
	public void run() {
		while(true) {
			System.out.println("plus 작업을 실행하는 쓰레드 이름: " + Thread.currentThread().getName());
			Main.x++;
			System.out.println("x값 증가시킴");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("쓰레드가 자는데 방해받음");
				e.printStackTrace();
			}
		}
	}
}
