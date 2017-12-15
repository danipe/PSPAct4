package Ejercicio1;

public class MiThread extends Thread {
	
	public MiThread() {
		
	}
	
	@Override
	public void run() {
		//10 iteraciones con syso y sleep
		for (int i = 0; i < 10; i++) {
			System.out.println("iteracion desde el thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Termina el Thread");
	}
	
}
