package main;

public class PlusRunner implements Runnable{

	@Override
	public void run() {
		while(true) {
			
			Main.x++;
			System.out.println("Plus");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
