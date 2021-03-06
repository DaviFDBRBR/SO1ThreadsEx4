package controller;


public class ThreadSapos extends Thread{
	private int saltoMax;
	private int distMax;
	private int sapo;
	static int pos = 0;
	
	public ThreadSapos(int sapo) {
		this.saltoMax = 5;
		this.distMax = 15;
		this.sapo = sapo;
	}
	
	@Override
	public void run() {
		corrida();
		super.run();
	}
	
	public void corrida() {
		int salto = 0;
		int dist = 0;

		while (dist < distMax) {
			salto = (int) (Math.random() * (saltoMax+1));
			dist += salto;
			System.out.printf("n°%d saltou %d  m | Percorreu %d  m%n", sapo, salto, dist);
		}
		
		pos++;
		
		System.out.println("n°" + sapo + " terminou em " + pos + "º.");
	}
}
