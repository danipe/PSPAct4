package Ejercicio1;

public class MiRunnable implements Runnable {
	public MiRunnable() {
		new Thread(this).start();
	}

	@Override
	public void run() {
		//10 iteraciones con syso y sleep
		for (int i = 0; i < 10; i++) {
			System.out.println("iteracion desde el runnable");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Termina el Runnable");
	}
}
