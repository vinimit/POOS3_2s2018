package view;

import model.Estudante;

public class Main {

	public static void main(String[] args) {
		Estudante pio;
		Estudante gustavo;
		
		pio = new Estudante("Gustavo Pio");
		gustavo = new Estudante("Gustavo Fernandes");
		
		System.out.println(pio.getNome());
		System.out.println(gustavo.getNome());
	}
}
