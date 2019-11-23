package com.regis.join;

public class MinhaThread implements Runnable {

	private String nome;
	private int tempo;
	
	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
//		Thread t = new Thread(this);
//		t.start();
		System.out.println(nome + " entrou no estado de 'runnable'");
	}
	
	@Override
	public void run() {
		System.out.println(nome + " entrou no estado de 'running'");
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(nome + " contador " + i);
				Thread.sleep(tempo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(nome + " entrou no estado de 'dead'");
	}

}