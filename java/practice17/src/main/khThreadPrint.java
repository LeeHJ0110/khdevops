package main;

public class khThreadPrint extends Thread{

	@Override
	public void run() {
		while(true) {
			System.out.println("print 작업을 실행하는 쓰레드 이름: " + Thread.currentThread().getName());
			System.out.println("Main.x : " + Main.x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("쓰레드가 자는데 방해받음");
				e.printStackTrace();
			}
		}
	}

}
