package view;

import model.Contato;
import model.Contato2Fones;

public class Main {

	public static void main(String[] args) {
		Contato contato1;
		Contato2Fones contato2, contato3;
		
		contato1 = new Contato("Joselito", 16, 33032330);
		contato2 = new Contato2Fones("Garfield", 16, 33032332, 16, 991239911);
		contato3 = new Contato2Fones("Presuntinho", 16, 33032332);
		
		System.out.println("Contato: " + contato1.toString());
		System.out.println("Contato: " + contato2.toString());
		System.out.println("Contato: " + contato3.toString());
	}
}
