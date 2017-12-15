package Ejercicio1;

public class Main {

	public static void main(String[] args) {	
		//Metodo main
		conRunnable();
		conThread();
	}
	
	public static void conThread() {
		//Metodo utilizando la clase Thread
		MiThread mt = new MiThread();
		mt.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Iteracion desde el main");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			mt.join();
			System.out.println("termina el main");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void conRunnable() {
		//Metodo utilizando la clase Runnable
		new MiRunnable();
		for (int i = 0; i < 10; i++) {
			System.out.println("Iteracion desde el main");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
