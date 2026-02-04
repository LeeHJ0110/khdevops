package main;

public class PlaceRunnder implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println(Main.x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
