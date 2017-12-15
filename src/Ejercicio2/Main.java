package Ejercicio2;

public class Main {
	//Metodo main
	public static void main(String[] args) {
		Compartido c = new Compartido();
		new MiThread(c).start();
		new MiThread(c).start();
	}
}


class Compartido {
	int suma, cont = 0;
	
	public synchronized void nuevoValor(int valor) {
		//Metodo compartido entre threads
		this.suma += valor;
		this.cont ++;
	}
	//devuelve la media
	public float media() {
		return this.suma/this.cont;
	}
	//devuelve la suma total
	public int suma() {
		return this.suma;
	}
	//devuelve el numero de valores introducidos
	public int cont() {
		return this.cont;
	}
}


class MiThread extends Thread {
	//Thread con un objeto compartido c
	Compartido c;
	public MiThread(Compartido c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		//Durante diez iteraciones llama a al metodo nuevo valor del objeto compartido de manera sincronizada
		for(int i = 1; i < 10; i++) {
			synchronized(c) {
				this.c.nuevoValor(i);
				System.out.println(c.media());
			}
			
		}
	}
}