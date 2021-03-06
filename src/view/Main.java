package view;

import controller.ThreadSapos;

public class Main {

	public static void main(String[] args) {
		for(int c = 0; c < 5; c++) {
			ThreadSapos ts = new ThreadSapos(c);
			ts.start();
		}
		
	}

}
