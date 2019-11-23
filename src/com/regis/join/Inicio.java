package com.regis.join;

public class Inicio {

	public static void main(String[] args) {
		
		MinhaThread t1 = new MinhaThread("Thread #1", 600);
		MinhaThread t2 = new MinhaThread("Thread #2", 900);
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		thread1.start();
		
		try {
			thread1.join();
			thread2.join();
			
			// Executa a próxima linha depois que a thread1 terminar, ou depois que 200 miliseundos terminar. O que vier primeiro
//			thread1.join(200);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Final do programa");

	}

}